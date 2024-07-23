package fr.dawan.javabdd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.dawan.javabdd.model.Produit;

/*
 * * Un DAO contient les différentes qu'on effectue sur une base de donnée (CRUD)
 * *
 * * Deux méthodes :
 * * 	- executeQuery Lire les données (SELECT)
 * *	- executeUpdate Modifie les données (INSERT, UPDATE,DELETE)
 * *
 */

public class ProduitDAO implements IProduitDAO {

	@Override
	public List<Produit> getAll(Connection cnx) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Requête SQL : SELECT * FROM 'NOM DE LA TABLE'
		 */
		List<Produit> lp = new ArrayList<Produit>();
		String sql = "SELECT * FROM produits";

		// Créer un objet PrepareStatement
		PreparedStatement ps = cnx.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Produit p = new Produit();
			p.setId(rs.getLong("id"));
			p.setDescription(rs.getString("description"));
			p.setPrix(rs.getDouble("prix"));
			p.setQuantité(rs.getInt("quantité"));

			lp.add(p);
		}

		return lp;
	}

	@Override
	public void insert(Produit p, Connection cnx) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Requete SQL inséré un produit : INSERT INTO produits(description,prix,quantité) VALUES ('Samsung','1500','20')*/
		
		String sql = "INSERT INTO produits(description,prix,quantité) VALUES(?,?,?)";
		
		// Créer un objet PrepardStatement à partir de la connexion et la requete sql
		PreparedStatement ps = cnx.prepareStatement(sql);
		// On va récupére les valeurs à insérer
		ps.setString(1, p.getDescription());
		ps.setDouble(2, p.getPrix());
		ps.setInt(3, p.getQuantité());
		
		ps.executeUpdate();
		
	}

	@Override
	public void deleteById(long id, Connection cnx) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Produit p, Connection cnx) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Produit findById(long id, Connection cnx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
