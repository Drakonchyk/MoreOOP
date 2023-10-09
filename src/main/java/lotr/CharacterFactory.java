package lotr;
import java.util.Random;

class CharacterFactory {
    private Random random = new Random();

    public Character createCharacter() {

        int characterType = random.nextInt(4);
        switch (characterType) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return null;
        }
    }
}
