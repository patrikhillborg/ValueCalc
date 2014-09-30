package project;

public class Apparater extends Prylar {

	private int inköpspris;
	private int slitage;

	public Apparater(String t, String so, int i, int s) {
		super(t, so);
		inköpspris = i;
		slitage = s;
	}

	public int getInköpspris() {
		return inköpspris;
	}

	public int getSlitage() {
		return slitage;
	}

	public int getVärde() {
		return (int) (inköpspris * (slitage / 10f));
	}

}