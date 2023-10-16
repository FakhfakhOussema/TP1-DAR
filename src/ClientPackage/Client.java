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
		int choix=0;
		int resultat=0;

		
		// TODO Auto-generated method stub
		try
		{
		InetAddress host = InetAddress.getByName("localhost");
		System.out.println("Je suis un client pas encore connecte ");
		socket = new Socket(host,1234);
		System.out.println("Je suis un client connecte ");
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		Scanner val;
		System.out.println("donner un entier ");
		val= new Scanner(System.in);
		int x =val.nextInt(); 
		os.write(x); 
		

		do
		{
			System.out.println("Menu:");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("choisir un service ");
			val= new Scanner(System.in);
			choix =val.nextInt(); 

				if(choix<1 || choix>4)
				{
				 System.out.println("le choix est invalide");
				}
			
		}while(choix<1 || choix>4);		

		
		switch (choix) 
		{
		 	case 1:
		 		os.write(1);
		 		resultat= is.read();
		 		System.out.println(x+"+5 egale a "+resultat);
		 		break;
		 	case 2:
		 		os.write(2);
		 		resultat= is.read();
		 		System.out.println(x+"-5 egale a "+resultat);
		 		break;
		 	case 3:
		 		os.write(3);
		 		resultat= is.read();
		 		System.out.println(x+"*5 egale a "+resultat);
		 		break;
		 	case 4:
		 		os.write(4);
		 		resultat= is.read();
		 		System.out.println(x+"/5 egale a "+resultat);
		 		break;
		 	default:
		 		System.out.println("le choix est invalide");
		 }
	

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		socket.close();
	}

}




