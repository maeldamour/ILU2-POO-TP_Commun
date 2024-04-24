package model;

public class ReservationRestaurant extends Reservation {
	int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois, numService);
		this.numTable = numTable;
	}
	
	public String toString() {
		if (numService == 1) {
			return "Le " + jour + "/" + mois + " : table " + numTable + " pour le premier service.";
		} else {
			return "Le " + jour + "/" + mois + " : table " + numTable + " pour le deuxième service.";
		}
	}
}
