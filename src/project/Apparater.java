package project;

public class Apparater extends Prylar {

	private int ink�pspris;
	private int slitage;

	public Apparater(String t, String so, int i, int s) {
		super(t, so);
		ink�pspris = i;
		slitage = s;
	}

	public int getInk�pspris() {
		return ink�pspris;
	}

	public int getSlitage() {
		return slitage;
	}

	public int getV�rde() {
		return (int) (ink�pspris * (slitage / 10f));
	}

}