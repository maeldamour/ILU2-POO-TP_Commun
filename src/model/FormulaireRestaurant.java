package model;

public class FormulaireRestaurant extends Formulaire {
	int nbPersonnes;
	int numService;
	int numIdentification;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService)  {
		this.jour = jour;
		this.mois = mois;
		this.nbPersonnes = nbPersonnes;
		this.numService = numService;
	}
	
	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}

	public void setIdentificationEntite(int numIdentification) {
		this.numIdentification = numIdentification;
	}
	
	public int getIdentificationEntite() {
		return numIdentification;
	}
}
