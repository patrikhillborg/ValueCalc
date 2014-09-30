package project;

public abstract class Prylar {

	private String typ;
	private String sort;

	public Prylar(String t, String so) {
		typ = t;
		sort = so;
	}

	public String getTyp() {
		return typ;
	}

	public abstract int getVärde();

	public String getSort() {
		return sort;
	}
}
