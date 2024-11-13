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

        //Skapa nya skyddsalternativ
        Armor helmet = new Armor("Sigurdshelmen av Skymningsväktare", 2f,5);
        Armor chestplate = new Armor("Zeus Gyllenbrynja av Åsksmidets Eld", 5f, 10);
        Armor Shoes = new Armor("Hades Sabatoner3 från Underjordens Flammor", 2f,3);

        //Visa spelaren dem nya skyddsutrustningarna och fråga vilken den vill ta upp den
        System.out.println("\nDu hittade 3 olika delar av skydd, välj en av dem:");
        System.out.println("1. Helmet (Protection: 5, Weight: 1.5)");
        System.out.println("2. Chestplate (Protection: 15, Weight: 3.0)");
        System.out.println("3. Boots (Protection: 3, Weight: 1.0)");

        System.out.println("\nSkriv ett number av dem 3 delarna som du vill plocka up (1, 2, 3): ");
        int val = scanner.nextInt();

        switch (val) {
            case 1:
                player.backpack.addItem(helmet);
                System.out.println("Du plockade up " + helmet.name);
                break;
            case 2:
                player.backpack.addItem(chestplate);
                System.out.println("Du plockade up " + chestplate.name);
                break;
            case 3:
                player.backpack.addItem(Shoes);
                System.out.println("Du plockade up " + Shoes.name);
                break;
            default:
                System.out.println("Ogiltigt svar. inget lades till i din väska.");
                break;
        }

        System.out.println("\nUppdaterad väska:");
        player.backpack.display();


        scanner.close();
    }
}