package fr.dawan.javabdd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionBDD {

	public static Connection getConnection() throws Exception {

		// Objet properties pour récuperer les valeurs du fichier application.properties
		Properties p = new Properties();
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));

		// Chargement du driver pour établir la connexion avec la base de données
		// Class.forName(p.getProperty("driver"));

		Connection cnx = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("pwd"));

		System.out.println("Connexion reussi");
		
		return cnx;
	}
}
