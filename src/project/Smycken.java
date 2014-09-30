package project;

public class Smycken extends Prylar {

	private int antal�delstenar;
	private int material;

	public Smycken(String t, String so, int a, int m) {
		super(t, so);
		antal�delstenar = a;
		material = m;
	}

	public int getAntal�delstenar() {
		return antal�delstenar;
	}

	public int getMaterial() {
		return material;
	}

	public int getV�rde() {
		int materialV�rde;
		if (material == 1) {
			materialV�rde = 2000;
		} else {
			materialV�rde = 700;
		}
		return antal�delstenar * 500 + materialV�rde;

	}
}
