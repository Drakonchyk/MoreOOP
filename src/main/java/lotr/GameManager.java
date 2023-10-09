package lotr;

class GameManager {
    public void fight(Character c1, Character c2) {
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("Two hobbits can just cry");
            return;
        }
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("First attacks");
            c1.kick(c2);
            System.out.println("Second attacks");
            c2.kick(c1);
            System.out.println("Character 1 HP: " + c1.hp + " | Character 2 HP: " + c2.hp);
        }
        if (c1.isAlive()) {
            System.out.println("Character 1 wins!");
        } else {
            System.out.println("Character 2 wins!");
        }
    }
}
