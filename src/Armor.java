public class Armor extends Item {
    float protection;

    public Armor(String name, float weight, float protection){
        super(name, weight);
        this.protection = protection;
    }
}
