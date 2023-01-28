package fr.eni.ecole.POO.groupeEleves.entite;

/**
 * Classe qui modélise une classe d'élèves avec un instituteur
 * 
 * @author benocode
 * @date 23/12/2022
 * @version 1.0
 */
public class Classe {

	private Eleve[] eleves = new Eleve[20];

	private String nom;
	private int nbEleves;
	private Instituteur instituteur;
	private Eleve eleve;

	/**
	 * Constructeur sans paramètres
	 */
	public Classe() {
	}

	/**
	 * Constructeur pour créer une instance de classe avec un nom
	 * 
	 * @param nom
	 */
	public Classe(String nom) {
		this.nom = nom;
	}

	/**
	 * Méthode pour affecter un élève à une classe
	 * 
	 * @param eleve
	 */
	public void addEleve(Eleve e) {
		// TODO : placer l'élève dans la bonne case du tableau
		this.eleve = e;
	}

	/**
	 * Méthode pour récupérer un élève de la classe
	 * 
	 * @return l'élève n°x de la classe
	 */
	public Eleve getEleve(int index) {
		Eleve e = this.eleves[index];
		return e;
	}

	/**
	 * Méthode pour récupérer la liste de tous les élèves d'une classe
	 * 
	 * @return un tableau des élèves d'une classe
	 */
	public Eleve[] getLstEleves() {
		Eleve[] listeEleves = eleves.clone();
		return listeEleves;
	}

	/**
	 * Méthode pour récupérer la liste des parents référents des élèves d'une classe
	 * 
	 * @return un tableau des parents référents des élèves d'une classe
	 */
	public Parent[] getLstParent() {
		Parent[] listereferents = new Parent[20];
		for (int i = 0; i < 20; i++) {
			listereferents[i] = eleves[i].getParent();
		}
		return listereferents;
	}

	/**
	 * Getter pour récupérer le nom de la classe
	 * 
	 * @return le nom de la classe
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Getter pour récupérer le nom de l'instituteur de la classe
	 * 
	 * @return l'instituteur
	 */
	public Instituteur getInstituteur() {
		return this.instituteur;
	}

	/**
	 * Méthode toString pour afficher la composition d'une instance de classe
	 * 
	 * @return le nom d'une classe, l'instituteur et la liste de ses élèves
	 */
	@Override
	public String toString() {
		StringBuilder classe = new StringBuilder("--------------------------------\n");
		classe.append("Classe : " + this.nom + "\n  Instituteur : " + this.getInstituteur() + "\n    avec :\n");
		for (Eleve e : eleves) {
			classe.append("    " + e.toString() + "\n");
		}
		classe.append("--------------------------------");
		return classe.toString();
	}
}
