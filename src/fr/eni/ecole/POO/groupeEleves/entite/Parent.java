package fr.eni.ecole.POO.groupeEleves.entite;

import java.time.LocalDate;

/**
 * Classe qui modélise le parent référent d'un élève
 * 
 * @author benocode
 * @date 23/12/2022
 * @version 1.0
 */
public class Parent extends Personne {

	/**
	 * Constructeur sans paramètres
	 */
	public Parent() {
		super();
	}

	/**
	 * Constructeur tous paramètres
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ddn     = date de naissance
	 */
	public Parent(String nom, String prenom, String adresse, LocalDate ddn) {
		super();
	}
}
