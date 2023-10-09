package lotr;

import java.util.Random;

class Knight extends Character {
    public Knight() {
        super(generateRandomValue(2, 12), generateRandomValue(2, 12));
    }
}
