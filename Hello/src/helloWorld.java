/**
 * Created by Sai Lalith Pathi on 5/23/2017.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
public class helloWorld {
    public static void main(String args[]){
        try {
            ServerSocket serverSocket = new ServerSocket(5454);
            while(true){
                Socket socket = serverSocket.accept();
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                printWriter.write("Hello Client !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}