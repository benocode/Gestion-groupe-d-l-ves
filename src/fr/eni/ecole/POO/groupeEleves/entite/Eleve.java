package fr.eni.ecole.POO.groupeEleves.entite;

import java.time.LocalDate;

public class Eleve extends Personne {

	private Parent referent;

	/**
	 * Constructeur sans paramètres
	 */
	public Eleve() {
		super();
	}

	/**
	 * Constructeur avec paramètres de la classe Personne
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ddn     = date de naissance
	 */
	public Eleve(String nom, String prenom, String adresse, LocalDate ddn) {
		super();
	}

	/**
	 * Méthode pour récupérer le parent d'un élève
	 * 
	 * @return parent
	 */
	public Parent getParent() {
		return this.referent;
	}

	/**
	 * Méthode pour affecter un parent à un élève
	 */
	public void setParent(Parent referent) {
		this.referent = referent;
	}

	/**
	 * Méthode toString pour récupérer les valeurs d'une instance d'élève
	 * 
	 * @return nom prénom adresse né(e) le XX/XX/XXXX
	 */
	@Override
	public String toString() {
		return super.toString();
	}
}
