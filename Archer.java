package s26844_projekt.heroses.model;

import java.util.Scanner;
import s26844_projekt.heroses.aplication.Main;
import s26844_projekt.heroses.model.Hero;
import java.util.Scanner;
public class Archer extends Hero
{
    public Archer(double strength, double defence, double intelligence, double dextrity, double agility, double speed)
    {
        super(strength, defence, intelligence, dextrity, agility, speed);
        printInfo();
        waitFor();
        level(1.05, 1.05, 1.0, 1.2, 1.1, 1.05);
    }
}
