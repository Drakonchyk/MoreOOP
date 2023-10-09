package lotr;
import java.util.Random;

class King extends Character {
    public King() {
        super(generateRandomValue(5, 15), generateRandomValue(5, 15));
    }
}