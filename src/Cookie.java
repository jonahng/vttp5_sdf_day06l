import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cookie {
    private static List<String> cookies;


public static void init(String cookieFile){
    cookies = getDataFromTextFile(cookieFile);
}

public static String getRandomCookie(){
    String randomCookie = "";
    Random rand = new Random();
    int randIndex = rand.nextInt(cookies.size());
    randomCookie = cookies.get(randIndex);
    return randomCookie;
}

public static List<String> getDataFromTextFile(String cookieFile){
    List<String> cookies = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader((cookieFile)))){
        String line;
        while((line = br.readLine()) != null){
            cookies.add(line);
        }
    }

}

}