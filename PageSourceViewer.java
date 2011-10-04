import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class PageSourceViewer {
    public static void main(String[] args) {
         
       String line;
       Scanner kbd = new Scanner(System.in);
       
       System.out.print("URL: ");
       String site = kbd.nextLine();
        
        
        try {
            URL url = new URL("http://"+site);

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();

        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
