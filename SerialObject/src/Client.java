  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
         
				Socket socket=new Socket("localhost",Server.port);
		ObjectOutputStream fout=new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream fin=new ObjectInputStream(socket.getInputStream());
         //fout.writeObject(name);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         while(true) {
        	 String readInput=br.readLine();
        	 String[] readInputTokens=readInput.split("");
        	 
        	 Message message=new Message(Integer.decode(readInputTokens[0]),Integer.decode(readInputTokens[1]));
        	 fout.writeObject(message);
        	 Message returnMessage=(Message)fin.readObject();
        	 System.out.println(returnMessage.getresult());
         
      
	}}

}
