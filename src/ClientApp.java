import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ClientApp{
    public static void main(String[] args) {
        if(args.length == 0){
            System.err.println("usageL javaworkshop6 <server>:<port>");
            return;
        }

        String[] arrSplit = args[0].split(":");
        if(arrSplit.length != 2){
            System.err.println("Invalid server:port format");
            return;

        }
        String serverAddress = arrSplit[0];
        int serverPort = Integer.parseInt(arrSplit[1]);
        try(new Socket(serverAddress, serverPort))
            InputStream is = client.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = client.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
        }catch(IOException e){
            System.err.println("clientapp:" + e.getMessage());

        }catch()
    }


}