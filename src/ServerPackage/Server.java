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
		int choix=0;
		int resultat ;

		
		try 
		{

			serversocket = new ServerSocket(1234);
			System.out.println("je suis un serveur en attente la connexion d'un client ");
			socket = serversocket.accept();
			System.out.println("un client est connecte ");	
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			nb=is.read();
			choix=is.read();
		
			switch (choix) 
			{
			case 1:

				resultat = nb + 5;
				os.write(resultat);
				break;
			case 2:
				resultat = nb - 5;
				os.write(resultat);
				break;
			case 3:
				resultat = nb * 5;
				os.write(resultat);
				break;
			case 4:
				resultat = nb / 5;
				os.write(resultat);
				break;
			default:
				System.out.println("Return to Client.");
		 }

			socket.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
