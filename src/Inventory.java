import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty");
        } else{
            System.out.println("Inventory contains:");
            for(Item item : items) {
                System.out.println(" - " + item.name);
            }
        }
    }
}
