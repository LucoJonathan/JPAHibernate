package fr.dawan.javabdd.model;

import java.io.Serializable;

public class Produit implements Serializable {

	private static final long serialVersionUID = -3746498010011177849L;

	private long id;
	private String description;
	private double prix;
	private int quantité;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String description, double prix, int quantité) {
		super();
		this.description = description;
		this.prix = prix;
		this.quantité = quantité;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	@Override
	public String toString() {
		return "Produit []";
	}

}
