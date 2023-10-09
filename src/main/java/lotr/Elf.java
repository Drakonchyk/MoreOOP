package lotr;

class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0); // Kill characters weaker than the Elf
        } else {
            if( c.power > 0) {
            this.power--;}
        }
    }
}
