package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Huvudprogram {
    static Scanner sc = new Scanner(System.in);

    static int readInt(String siffra) {
        for (;;) {
            try {
                System.out.print(siffra);
                int x = Integer.parseInt(sc.nextLine());
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Du ska ange en siffra!");
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> allaPersoner = new ArrayList<Person>();
       
        while (true) {
       
            System.out.println("1 = Skapa person" + "\n"
                    + "2 = Skapa pryl" + "\n" + "3 = Visa alla personer"
                    + "\n" + "4 = Visa den rikaste" + "\n" + "5 = Visa en viss person"
                    + "\n" + "6 = Börskrasch" + "\n" + "7 = Avsluta programmet" + "\n");
            int kommando = readInt("Ange ett val:" + "\n");
            switch (kommando){           
            case 1:
                System.out.println("Ange personens namn: ");
                String namn = sc.nextLine();
                Person nyn = new Person(namn);
                boolean finnsPersonen = false;
                for (int x = 0; x < allaPersoner.size(); x++) {
                    if (nyn.getNamn().equals(allaPersoner.get(x).getNamn())) {
                        finnsPersonen = true;
                    }
                }
                if (finnsPersonen == true) {
                    System.out.println("Personen finns redan!");
                } else {
                    allaPersoner.add(new Person(namn));
                }
                break;

            case 2:
                System.out.println("Vem är prylens ägare?");
                String namn1 = sc.nextLine();
                Person pers = null;
                for (Person p : allaPersoner)
                    if (namn1.equalsIgnoreCase(p.getNamn()))
                        pers = p;
                if(pers==null){
                    System.out.println("Personen finns inte");
                }
                else{
                System.out.println("Är prylen ett smycke, en aktie eller en apparat?");
                String typ = sc.nextLine();
                if (typ.equals("smycke")) {
                    System.out.println("Vilket sorts smycke? ");
                    String sort = sc.nextLine();
                    int antalÄdelstenar = readInt("Ange antal ädelstenar" + "\n");
                    int material = readInt("Är smycket av: 1 = Guld eller 2 = Silver?" + "\n");
                    pers.addPryl(new Smycken(typ, sort, antalÄdelstenar,material));
                } else if (typ.equals("aktie")) {
                    System.out.println("Vad heter aktien? ");
                    String sort = sc.nextLine();
                    int antalAktier = readInt("Hur många aktier?" + "\n");
                    int pris = readInt("Vad kostar en aktie?" + "\n");
                    pers.addPryl(new Aktier(typ, sort, antalAktier, pris));
                } else if (typ.equals("apparat")) {
                    System.out.println("Vad är det för apparat?");
                    String sort = sc.nextLine();
                    int inköpspris = readInt("Vad var inköpspriset?" + "\n");
                    int slitage = readInt("Hur sliten är apparaten mellan 1 - 10?" + "\n");
                    pers.addPryl(new Apparater(typ, sort, inköpspris, slitage));
                    }
                    else {
                            System.out.println("Fel inmatning!");
                         }
                    }
                break;

            case 3:
                System.out.println("I registrer finns: ");
                for (int x = 0; x < allaPersoner.size(); x++)
                    System.out.println(allaPersoner.get(x));
                break;

            case 4:
                int maxVärde = 0;
                int personIndex = 0;
                for (int x = 0; x < allaPersoner.size(); x++) {
                    if (allaPersoner.get(x).getTotal() > maxVärde) {
                        maxVärde = allaPersoner.get(x).getTotal();
                        personIndex = x;
                    }
                }
                System.out.println(allaPersoner.get(personIndex).getNamn() + " är rikast med: " + allaPersoner.get(personIndex).getTotal() + "\n" + allaPersoner.get(personIndex).getPrylar());
                break;

            case 5:
                System.out.println("Vilken person vill du se?");
                String specPerson = sc.nextLine();
                boolean ingenPerson = true;
               
                for (int x = 0; x < allaPersoner.size(); x++){
                    if (specPerson.equalsIgnoreCase(allaPersoner.get(x).getNamn())) {
                        System.out.println(allaPersoner.get(x).getNamn() + " har: " + allaPersoner.get(x).getTotal() + "\n" + allaPersoner.get(x).getPrylar() + "\n");
                        ingenPerson = false;
                    }
                }
                if (ingenPerson == true) {
                    System.out.println("Personen finns inte!");
                }
                break;

            case 6:
                for(int x = 0; x < allaPersoner.size(); x++)
                    allaPersoner.get(x).börskrasch();
                break;

            case 7:
                System.out.println("Programmet avslutas!");
                System.exit(0);
                    break;
            }
        }
    }
}