package tank;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Thread {

    private Socket client;
    private Socket client2;
    private PrintStream output;
    private PrintStream output2;
    // @Override

    public void run(String s) {
        try {
            client = new Socket("127.0.0.1", 6000);

            //write to the socket
            output = new PrintStream(client.getOutputStream());
            output.print(s);

            client.close();

        } catch (UnknownHostException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void run2(String s){
        try {

            client2 = new Socket("127.0.0.1", 8000);
            //write to the socket
            output2 = new PrintStream(client2.getOutputStream());
            output2.print(s);

            client2.close();

        } catch (UnknownHostException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
