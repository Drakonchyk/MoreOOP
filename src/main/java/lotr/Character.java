package lotr;
import lombok.Getter;

import java.util.Random;
@Getter
class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        int damage = Math.min(this.power, c.hp);
        c.setHp(c.hp - damage);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    protected static int generateRandomValue(int minValue, int maxValue) {
        return new Random().nextInt(maxValue - minValue + 1) + minValue;
    }
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.hp + ", power=" + this.power + "}"; }
}
