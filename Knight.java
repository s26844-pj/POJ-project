package s26844_projekt.heroses.model;
import s26844_projekt.heroses.aplication.Main;
import s26844_projekt.heroses.model.Hero;
import java.util.Scanner;
public class Knight extends Hero
{
    public Knight(String name, double strength, double defence, double intelligence, double dextrity, double agility,
                  double speed)
    {
        super(name, strength, defence, intelligence, dextrity, agility, speed);
        printInfo();
        waitFor();
        level(1.2, 1.1, 1.0, 1.05, 1.02, 1.05);
    }
}
