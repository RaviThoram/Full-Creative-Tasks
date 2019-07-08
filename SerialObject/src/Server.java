import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int port=8067;
public static void main(String[] args) throws ClassNotFoundException, IOException {
	new Server().runServer();
}
public void runServer() throws IOException, ClassNotFoundException {
	ServerSocket serversocket=new ServerSocket(port);
	System.out.println("ready for connection");
	while(true) {
	Socket socket=serversocket.accept();
	new ServerThread(socket).start();
		}}


}
