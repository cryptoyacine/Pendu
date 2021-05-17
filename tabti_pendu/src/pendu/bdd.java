package pendu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class bdd{
	public Connection connexion() {
		
		Connection cnx = null;
		// On stock dans des variables l'URL de connexion � la base de donn�es avec les identifiants  
		String url="jdbc:mysql://localhost/pendu?serverTimezone=UTC";  
        String user="root";  
        String password="";  
        // Test pour v�rifier si nous arrivons � nous connecter
        try {  
       	 // On cr�� une variable cnx de type Connection 
       	 // cnx contiendra la connextion � la base de donn�es
        	cnx = DriverManager.getConnection(url,user,password);  
            System.out.println("Etat de la connexion :");  
		// Forme ternaire du if. Si la condition � �chou� alors on affiche � ferm� � sinon on affiche � ouverte � 
            System.out.println(cnx.isClosed()?"ferm�e":"ouverte");  
                 
        } 
        // Si on arrive pas � se connetcer on attrape l'erreur pour l'afficher ensuite
			catch (SQLException e) {  
            System.out.println("Une erreur est survenue lors de la connexion � la base de donn�es");  
            e.printStackTrace();  
        }
        return cnx;
	}
}