package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


import java.net.InetAddress;

public class Client 
{
	public static void main(String[] args) throws IOException
	{
		Socket socket = null;
		// TODO Auto-generated method stub
		try
		{
		InetAddress host = InetAddress.getByName("localhost");
		System.out.println("Je suis un client pas encore connecte ");
		socket = new Socket(host,1234);
		System.out.println("Je suis un client connecte ");
		
		Scanner val;
		System.out.println("donner un entier ");
		val= new Scanner(System.in);
		int x =val.nextInt(); 
		
		OutputStream os = socket.getOutputStream();
		os.write(x); 

		InputStream is = socket.getInputStream();
		int nb=is.read();
		
		System.out.println(x+"*5 egale a : " +nb);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		socket.close();
	}

}




