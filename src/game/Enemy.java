package game;

public class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void takeDamage(int damage){
        this.health -= Math.min(health,damage);
        System.out.println(name + " получил урон " + damage + ".Осталось " + health + " здоровья");
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}