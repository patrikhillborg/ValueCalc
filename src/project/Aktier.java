package project;

public class Aktier extends Prylar {

	private int antalAktier;
	private int pris;

	public Aktier(String t, String so, int aa, int p) {
		super(t, so);
		antalAktier = aa;
		pris = p;

	}

	public int getAntalAktier() {
		return antalAktier;
	}

	public double getPris() {
		return pris;
	}

	public int getVärde() {
		return antalAktier * pris;
	}

	public void börskrasch() {
		pris = 0;
	}
}