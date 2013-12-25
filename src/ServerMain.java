import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.io.*;
	
public class ServerMain{

		
	public static void main(String[] args) 
	{
		int i=1;
		BufferedReader in;
		dataBaseServer d= new dataBaseServer();
		String requete="";
		
		
		// TODO Auto-generated method stub
	
		
			ServerSocket socketserver;
			try {
				socketserver = new ServerSocket(2009);
				Socket socket[] =  new Socket[100];
				Thread list[]=new Thread[100];
			
			
			while (i<11)
			{
				System.out.println("Serveur en attente d'un client");
				socket[i]=socketserver.accept();
				d.socket[i]=socket[i];
				in = new BufferedReader (new InputStreamReader (socket[i].getInputStream()));
				
					
					
					requete = in.readLine();
					System.out.println("requete reçu:"+requete);
					d.nameplayers[i]=requete;
					d.nbjoueurs=i;
					
					
//					list[i] = new Thread(new ServerSelectedList(socket[i],i));
//					list[i].start();
					
				
				
				i++;
			}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
