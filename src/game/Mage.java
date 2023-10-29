package game;

public class Mage extends Hero{
    public Mage(String name, int damage) {
        super(name, damage);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+" задействовал магию в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
