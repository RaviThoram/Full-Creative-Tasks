import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread{
   Socket socket=null;
   ServerThread(Socket socket){
	   this.socket=socket;
   }
   public void run() {
	   Message message=null;
	   try {
		   ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
		  ObjectOutputStream ous=new ObjectOutputStream(socket.getOutputStream());
		  //String username=(String)ois.readObject();
		 // System.out.println(username+"user is now connected");
		   while((message=(Message)ois.readObject())!=null) {
			   doSomething(message);
			   ous.writeObject(message);
			   
		   }
		   socket.close();
	   }catch(IOException e) {
		   e.printStackTrace();
	   } catch (ClassNotFoundException e) {
				e.printStackTrace();
	}
   }
private void doSomething(Message message) {
	message.setresult(message.getfirstNumber().intValue()*message.getsecondNumber().intValue());	
}
}
