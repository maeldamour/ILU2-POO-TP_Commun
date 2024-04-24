package model;

public class CalendrierAnnuel {
	Mois[] calendrier;
	String[] listeNomMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Decembre"};
	int[] listeJoursMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		for (int i = 0; i < 12; i++) {
			this.calendrier[i] = new Mois(listeNomMois[i], listeJoursMois[i]);
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour-1);
	}
	
	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			try {
				calendrier[mois-1].reserver(jour-1);
			} catch (IllegalStateException e) {
				System.out.println(e);
			}
			return true;
		}
		return false;
	}
	
	private static class Mois {
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i = 0; i < nbJours; i++) {
				this.jours[i] = false;
			}
		}
		
		private boolean estLibre(int jour) {
			return !jours[jour];
		}
		
		private void reserver(int jour) throws IllegalStateException {
			if (estLibre(jour)) {
				jours[jour] = true;
			} else {
				throw new IllegalStateException("Erreur reserver(): jour n'est pas libre.");
			}
		}
	}
}
