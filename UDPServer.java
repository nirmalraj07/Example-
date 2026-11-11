
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket(5000);
        byte[] b = new byte[1024];

        System.out.println("Server is waiting...");

        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Client Message: " + msg);

        DatagramPacket reply = new DatagramPacket(
            msg.getBytes(),
            msg.length(),
            dp.getAddress(),
            dp.getPort()
        );

        ds.send(reply);
        System.out.println("Message sent back to client.");

        ds.close();
    }
}
