package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{

	public static void main(String[] args) throws IOException
	{
		ServerSocket serversocket = null ;
		Socket socket = null ;
		int nb=0;
		// TODO Auto-generated method stub
		try 
		{
		serversocket = new ServerSocket(1234);
		System.out.println("je suis un serveur en attente la connexion d'un client ");
		socket = serversocket.accept();
		System.out.println("un client est connecte ");
	
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		socket.close();
	}
}
