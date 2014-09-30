package project;

import java.util.ArrayList;

public class Person {

	private ArrayList<Prylar> allaPrylar = new ArrayList<Prylar>();

	private String namn;

	public Person(String n) {
		namn = n;
	}

	public String getNamn() {
		return namn;
	}

	public void addPryl(Prylar p) {
		allaPrylar.add(p);
	}

	public void börskrasch() {
		for (int x = 0; x < allaPrylar.size(); x++) {
			if (allaPrylar.get(x) instanceof Aktier)
				((Aktier) allaPrylar.get(x)).börskrasch();
		}
	}

	public int getTotal() {
		int total = 0;
		for (int x = 0; x < allaPrylar.size(); x++)
			total = total + allaPrylar.get(x).getVärde();
		return total;
	}

	public String toString() {
		return namn + " har " + getTotal();
	}

	public String getPrylar() {
		String str = "";
		for (int y = 0; y < allaPrylar.size(); y++)
			str += allaPrylar.get(y).getSort() + " "
					+ allaPrylar.get(y).getVärde() + "\n";
		return str;
	}
}