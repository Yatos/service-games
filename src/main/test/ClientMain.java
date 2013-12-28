import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;

public class ClientMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip= "127.0.0.1";
		int port = 2009;
		Socket socket = null;
		//socket = new Socket(ip,port);
			try{	

				socket = new Socket(ip,port);
				System.out.println("SOCKET = " + socket + "\n-----------------------------------------------");//affiche sur la console
				
				//while(true)
				//{
						//Thread ecoute = new Thread(new ClientEcoute(socket));//permet de recuperer les requete du serveur
						//ecoute.start();

						Thread envoi = new Thread(new ClientSocket(socket));//permet d'envoyer des requetes au serveur
						envoi.start();	//commence le threads
					

				//}

			}catch(Exception e){//verifie si il n'y a pas d'erreur
				e.printStackTrace();
			}	
			
		   }
		
		
}
