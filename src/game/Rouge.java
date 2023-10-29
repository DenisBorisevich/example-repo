package game;

public class Rouge extends Hero{
    public Rouge(String name, int damage) {
        super(name, damage);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " подло нанёс удар клинком в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

