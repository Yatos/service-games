import java.net.Socket;
import java.net.Socket;

public class DataBaseServer {

	
		static String [] nameplayers =new String[100];// cree un tableau ou on met le nom des joueur
		int numeroServer;// recupere le numero du serveur pour savoir quel est le joueur
		static int nbjoueurs;//declare une variable utilise dans serveur register
		static Socket socket[] =  new Socket[100];// declare un tableau de socket
		static String requeteServeur[]=new String[100];//cree un tableau pour envoyer les requete au bon client

		public DataBaseServer()
		{
			
		}
		
		public DataBaseServer(int numeroServer)//recupere le numero du serveur
		{
			this.numeroServer=numeroServer;//le met dans une variable locale que l'on peut utilise
			
		}
		
		
		public void actualisation(String message)//lorsque on recoit un message d'un client
		{
			requeteServeur[numeroServer]=message;//on met le message dans la variable pour gerer le bon client
		}
		public void initialisation()//cree le tableau de requeteserveur
		{
			for(int i=0;i<100;i++)//pour les 100 cases
			{
				requeteServeur[i]="";//on initialise requete
			}
		}
		
		public void refresh()//permet de remettre a zero une certaine requete
		{
			
				requeteServeur[numeroServer]="";//reinitialise une certaine requete
			
		}

}
