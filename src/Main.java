import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character player = new Character("Roffe", 100);

        //Items som ska in i inventoryt
        Weapon tabbe = new Weapon("RallyTabben", 2f, 5, 100);
        Consumable potion = new Consumable("Lean", 0.5f,1);


        //lägg till start items i inventory
        player.backpack.addItem(tabbe);
        player.backpack.addItem(potion);
        //player.backpack.addItem(helmet);

        //Visa inventory
        System.out.println("Start väska");
        player.backpack.display();

        //Visa spelaren en ny hjälm och fråga om den vill ta upp den
        Armor helmet = new Armor("Sigurts heliga hjälm", 2f,5);
        System.out.println("\nDu hittade en legendarisk hjälm, vill du plocka up den? (Y/N): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("y")) {
            player.backpack.addItem(helmet);
            System.out.println("Sigurts heliga hjälm är tillagd i din väska.");
        }

        System.out.println("\nUppdaterad väska:");
        player.backpack.display();


        scanner.close();
    }
}