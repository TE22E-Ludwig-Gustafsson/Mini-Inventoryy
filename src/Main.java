import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Character player = new Character("Roffe", 100);

        //Items som ska in i inventoryt
        Weapon tabbe = new Weapon("RallyTabben", 2f, 5, 100);
        Consumable potion = new Consumable("Lean", 0.5f,1);


        //lägg till start items i inventory
        player.backpack.addItem(tabbe);
        player.backpack.addItem(potion);
        //player.backpack.addItem(helmet);

        //Visa inventory
        System.out.println("Start inventory");
        player.backpack.display();

        Armor helmet = new Armor("Sigurts heliga hjälm", 2f,5);

    }
}