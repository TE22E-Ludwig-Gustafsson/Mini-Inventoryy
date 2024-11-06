import java.util.Random;

public class Weapon extends Item {
    int minDamage;
    int maxDamage;
    Random random = new Random();

    public Weapon(String name, float weight, int minDamage, int maxDamage) {
        super(name, weight);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int attack(){
        return random.nextInt((maxDamage-minDamage)+1) + minDamage;
    }
}