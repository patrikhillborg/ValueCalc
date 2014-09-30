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

	public int getV�rde() {
		return antalAktier * pris;
	}

	public void b�rskrasch() {
		pris = 0;
	}
}