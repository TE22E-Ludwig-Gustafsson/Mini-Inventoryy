public class Main {
    public static void main(String[] args) {

        Character player = new Character("Roffe", 100);

        Weapon tabbe = new Weapon("RallyTabben", 2f, 5, 100);
        Consumable potion = new Consumable("Lean", 0.5f,1);
        Armor helmet = new Armor("Sigurts heliga hjälm", 2f,5);

        player.backpack.addItem(tabbe);
        player.backpack.addItem(potion);
        player.backpack.addItem(helmet);


    }
}