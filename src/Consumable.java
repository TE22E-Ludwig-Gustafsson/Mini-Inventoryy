public class Consumable extends Item {
    int useMax;
    int usesCurrent;

    public Consumable(String name, float weight, int useMax) {
        super(name, weight);
        this.useMax = useMax;
        this.usesCurrent = useMax;
    }

    public void use(Character target){
        if(usesCurrent > 0){
            target.hp += 10;
            usesCurrent--;
            System.out.println(name + "used on " + target.name + ". " + target.name + "'s HP increased by 10.");
        } else {
            System.out.println(name + " has no uses left.");
        }
    }
}
