package tank;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tank {

    public static void main(String[] args) {
        try {
            Client client = new Client();
            Server server = new Server(client);

            server.start();

        } catch (IOException ex) {
            Logger.getLogger(Tank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
