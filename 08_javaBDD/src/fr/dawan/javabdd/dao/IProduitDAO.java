package fr.dawan.javabdd.dao;

import java.sql.Connection;
import java.util.List;

import fr.dawan.javabdd.model.Produit;

public interface IProduitDAO {

	List<Produit> getAll(Connection cnx) throws Exception;
	void insert(Produit p, Connection cnx) throws Exception;
	void deleteById(long id, Connection cnx) throws Exception;
	void update(Produit p, Connection cnx) throws Exception;
	Produit findById(long id, Connection cnx) throws Exception;
}
