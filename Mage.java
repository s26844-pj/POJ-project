package s26844_projekt.heroses.model;
import s26844_projekt.heroses.aplication.Main;
import s26844_projekt.heroses.model.Hero;
import java.util.Scanner;
public class Mage extends Hero
{
    public Mage(double strength, double defence, double intelligence, double dextrity, double agility, double speed)
    {
        super(strength, defence, intelligence, dextrity, agility, speed);
        printInfo();
        waitFor();
        level(1.0, 1.0, 1.2, 1.05, 1.02, 1.0);
    }
}

