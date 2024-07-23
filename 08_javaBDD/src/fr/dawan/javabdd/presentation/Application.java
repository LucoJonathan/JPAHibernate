package fr.dawan.javabdd.presentation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.dawan.javabdd.dao.ConnectionBDD;
import fr.dawan.javabdd.dao.IProduitDAO;
import fr.dawan.javabdd.dao.ProduitDAO;
import fr.dawan.javabdd.model.Produit;

public class Application {

	
	public static void main(String[] args) {
		IProduitDAO dao = new ProduitDAO();
		Connection cnx = null;
		try {
			cnx = ConnectionBDD.getConnection();
			
			System.out.println("\nTest de la méthode getAll");
			List<Produit> produits = dao.getAll(cnx);
			System.out.println("");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(cnx != null) {
					cnx.close();}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
