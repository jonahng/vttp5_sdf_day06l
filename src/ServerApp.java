import java.io.*;
import java.nio.*;
import java.net.*;



public class ServerApp {

    public static final String ARG_MESSAGE = "usage: java workshop.serverapp <port number>";
    public static void main(String[] args) throws NumberFormatException, IOException {
        if(args.length <2){
            System.out.println(ARG_MESSAGE);
            return;
        }
        String serverPort = args[0];
        String cookieFile = args[1];


        try(ServerSocket server = new ServerSocket(Integer.parseInt(serverPort))){
            //initialise cookie file and store all the cookies to a list
            while(true){
                try(Socket client = server.accept()){
                    System.out.println("ServerApp: client is connected");
                    InputStream is = client.getInputStream();
                    DataInputStream dis = new DataInputStream(is);

                    OutputStream os = client.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    while(true){
                        String commandMesssage = dis.readUTF();
                        System.out.println("ServerApp:" + commandMesssage);
                        if(commandMesssage.equals("exit")){
                            break;
                        }else if(commandMesssage.equals("get-cookie")){
                            //call cookie object and random
                            String randomCookie = Cookie.getRandomCookie();
                            dos.writeUTF("cookie-text" + randomCookie);
                        }else{
                            dos.writeUTF("invalid command");
                        }

                    }
                }

            }

        }
    }
    
}
