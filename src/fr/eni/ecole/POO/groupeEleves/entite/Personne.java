package fr.eni.ecole.POO.groupeEleves.entite;

import java.time.LocalDate;

/**
 * Classe qui modélise une personne
 * 
 * @author benocode
 * @date 23/12/2022
 * @version 1.0
 */
public class Personne {

	private String nom;
	private String prenom;
	private String adresse;
	private LocalDate ddn;

	/**
	 * Constructeur sans paramètres
	 */
	public Personne() {
	}

	/**
	 * Constructeur tous paramètres
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ddn     = date de naissance
	 */
	public Personne(String nom, String prenom, String adresse, LocalDate ddn) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ddn = ddn;
	}

	/**
	 * Méthode toString pour récupérer les valeurs d'une instance de personne
	 * 
	 * @return nom prenom
	 */
	@Override
	public String toString() {
		return nom + " " + prenom;
	}

	/**
	 * Getter pour récupérer le nom de la personne
	 * 
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour modifier le nom de la personne
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour récupérer le prénom de la personne
	 * 
	 * @return le prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour modifier le prénom de la personne
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter pour récupérer l'adresse de la personne
	 * 
	 * @return l'adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter pour modifier l'adresse de la personne
	 * 
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter pour récupérer la date de naissance de la personne
	 * 
	 * @return la date de naissance
	 */
	public LocalDate getDdn() {
		return ddn;
	}

	/**
	 * Setter pour modifier la date de naissance de la personne
	 * 
	 * @param ddn = la date de naissance
	 */
	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

}
