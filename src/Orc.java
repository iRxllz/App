public class Orc extends Character {

    protected int baseHealth = 18;

    public Orc(Pair damage, int armor) {
        super(damage, armor);
        super.setCriticalDamage(criticalDamage);
    }

    @Override
    public int getCriticalDamage() {
        return super.getCriticalDamage();
    }

}