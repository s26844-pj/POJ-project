package s26844_projekt.heroses.model;
import s26844_projekt.heroses.aplication.Main;

import java.util.Scanner;

public class Hero {
    private String name;
    private double strength;
    private double defence;
    private double intelligence;
    private double dextrity;
    private double agility;
    private double speed;

    public Hero(double strength, double defence, double intelligence, double dextrity, double agility, double speed) {
        this.strength = strength;
        this.defence = defence;
        this.intelligence = intelligence;
        this.dextrity = dextrity;
        this.agility = agility;
        this.speed = speed;
    }
    public Hero(String name, double strength, double defence, double intelligence, double dextrity, double agility,
                double speed) {
        this(strength, defence, intelligence, dextrity, agility, speed);
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public double getDextrity() {
        return dextrity;
    }

    public void setDextrity(double dextrity) {
        this.dextrity = dextrity;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void waitFor() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printInfo() {
        double str = getStrength();
        double def = getDefence();
        double inl = getIntelligence();
        double dex = getDextrity();
        double agi = getAgility();
        double spe = getSpeed();

        String info = "\nPosiadasz następujące punkty doświadczenia: \nWytrzymałość: " + String.format("%6.2f",str)
                + "\nObrona: " + String.format("%6.2f",def) + "\nInteligencja: " +  String.format("%6.2f",inl)
                + "\nZręczność: " + String.format("%6.2f",dex) + "\nZwinność: " +  String.format("%6.2f",agi)
                + "\nSzybkość: " + String.format("%6.2f",spe);
        System.out.println(info);
    }
    public void level(double modStr, double modDef, double modInt, double modDex, double modAgi, double modSpe) {
        Scanner scan = new Scanner(System.in);
        int opt =0;
        do {
        System.out.println();
        System.out.println("\nPrzeszedłeś poziom gry, gratulacje!");
        waitFor();
        for (int points = 10; points > 0; points--) {
            System.out.println("\nMasz " + points + " punkty/ów do rozdysponowania na poszczególne umiejętności. \nPodaj " +
                    "umiejętność do której chcesz dodać 1 pkt. \n1. Wytrzymałość. \n2. Obrona. \n3. Inteligencja. \n4. " +
                    "Zręczność. \n5. Zwinność. \n6. Szybkość.");
            int skill = scan.nextInt();

            switch (skill) {
                case 1:
                    strength += modStr;
                    setStrength(strength);
                    System.out.println("Dodałeś punkt wytrzymałości.");
                    break;
                case 2:
                    defence += modDef;
                    setDefence(defence);
                    System.out.println("Dodałeś punkt obrony.");
                    break;
                case 3:
                    intelligence += modInt;
                    setIntelligence(intelligence);
                    System.out.println("Dodałeś punkt inteligencji.");
                    break;
                case 4:
                    dextrity += modDex;
                    setDextrity(dextrity);
                    System.out.println("Dodałeś punkt zręczności.");
                    break;
                case 5:
                    agility += modAgi;
                    setAgility(agility);
                    System.out.println("Dodałeś punkt zwinności.");
                    break;
                case 6:
                    speed += modSpe;
                    setSpeed(speed);
                    System.out.println("Dodałeś punkt szybkości.");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
                    points++;
            }
            printInfo();
            waitFor();
        }
            System.out.println("Wybierz: \nDowolna cyfra - aby grać dalej. \n0 - aby wyjść z programu.");
            int choose = scan.nextInt();
            switch(choose){

                case 0:
                    opt++;
                    System.out.println("Koniec gry.");
                    break;
                default:
                    System.out.println("Gramy dalej !");
                    waitFor();
                    break;
            }
        }
            while (opt < 1);
        }


}
