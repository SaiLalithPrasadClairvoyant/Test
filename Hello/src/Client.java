import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Sai Lalith Pathi on 5/23/2017.
 */
public class Client {
    public void go(){
        try {
            Socket ss = new Socket("localhost",5454);
            InputStreamReader inputStreamReader = new InputStreamReader(ss.getInputStream());
            BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
            String msg = bufferedReader.readLine();
            System.out.print(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Client c = new Client();
        c.go();
    }
}
