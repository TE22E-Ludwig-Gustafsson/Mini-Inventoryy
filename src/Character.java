public class Character {
    int hp;
    String name;
    Inventory backpack;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.backpack = new Inventory();
    }
}
