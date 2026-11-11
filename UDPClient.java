
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = sc.nextLine();

        byte[] b = msg.getBytes();

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dp = new DatagramPacket(
            b, b.length, ip, 5000
        );

        ds.send(dp);

        byte[] data = new byte[1024];
        DatagramPacket reply = new DatagramPacket(data, data.length);

        ds.receive(reply);

        String received = new String(
            reply.getData(), 0, reply.getLength()
        );

        System.out.println("Sent Message: " + msg);
        System.out.println("Received Message: " + received);

        if (msg.equals(received)) {
            System.out.println("Messages are SAME.");
        } else {
            System.out.println("Messages are NOT SAME.");
        }

        ds.close();
        sc.close();
    }
}
