package s26844_projekt.heroses.aplication;

import s26844_projekt.heroses.model.Archer;
import s26844_projekt.heroses.model.Hero;
import s26844_projekt.heroses.model.Knight;
import s26844_projekt.heroses.model.Mage;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("HEROSES v.1.1");

        System.out.println("\nWprowadź swój nick: ");
        String nick = scan.next();
        Hero[] heroes = new Hero[10];
        System.out.println("Wybierz postać: \n1. Mag \n punkty: wytrzymałości * 1; obrony * 1; inteligencji * 1.2;" +
                " zręczności * 1.05; zwinności * 1.02; szybkości * 1.\n2. Rycerz \n punkty: wytrzymałości * 1.2; obrony * 1.1;" +
                " inteligencji * 1; zręczności * 1.05; zwinności * 1.02; szybkości * 1.5\n3. Łucznik \n punkty: " +
                "wytrzymałości * 1.05; obrony * 1.05; inteligencji * 1; zręczności * 1.2; zwinności * 1.1; szybkości * 1.05");
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Twój bohater " + nick + " to Mag.");
                heroes[0] = new Mage(1, 1, 1, 1, 1, 1);
                break;

            case 2:
                System.out.println("Twój bohater " + nick + " to Rycerz.");
                heroes[1] = new Knight(nick, 1,1,1,1,1, 1);
                break;

            case 3:
                System.out.println("Twój bohater " + nick + " to Łucznik.");
                heroes[2] = new Archer(1, 1, 1, 1, 1, 1);
                break;

        }

    }

}
