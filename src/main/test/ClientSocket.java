import java.io.IOException;
import java.net.*;
import java.io.*;


public class ClientSocket implements Runnable{


		Socket socket;//declare une socket pour recuper les bonne reponse du serveur

		public ClientSocket(Socket socket)//constructeur
		{
			this.socket=socket;//recupere socket dans une variable locale
					
		}
	
		
		public void run() //permet de gerer les requete client
		{
		
			PrintWriter out;// décmare un buffer d'envoie

			try
			{
				try
				{
	              	  	
	              	  		Thread.currentThread().sleep(3000);//pause pour empecher au client de se lancer plus vite que le serveur
			
	              	  	
				
	              		}
	              		catch(InterruptedException ie)//attrape l'erreur
				{
//	              			
	              		}
				out = new PrintWriter(socket.getOutputStream());//declare le buffer de sortie
				out.println("REQUETE:RDY");//envoie d'une requete signifiant au serveur que le client est pret
				out.flush();//envoie de la requete
				while(true)//boucle infinie jusqu'a la fin du jeu
				{
						try
						{
		                  	  	
		                  	  		Thread.currentThread().sleep(500);//pause de 500ms pour que les autre programme puissent tourne
					
		                  	  	
						
		                  		}
		                  		catch(InterruptedException ie)//attrape l'erreur
						{
//		                  			
		                  		}
						
									
				}
			
			}
			catch (UnknownHostException e) 
			{
				
				e.printStackTrace();
			}catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			
		}
	
}
