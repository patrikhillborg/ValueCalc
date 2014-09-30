package project;

public class Smycken extends Prylar {

	private int antalÄdelstenar;
	private int material;

	public Smycken(String t, String so, int a, int m) {
		super(t, so);
		antalÄdelstenar = a;
		material = m;
	}

	public int getAntalÄdelstenar() {
		return antalÄdelstenar;
	}

	public int getMaterial() {
		return material;
	}

	public int getVärde() {
		int materialVärde;
		if (material == 1) {
			materialVärde = 2000;
		} else {
			materialVärde = 700;
		}
		return antalÄdelstenar * 500 + materialVärde;

	}
}
