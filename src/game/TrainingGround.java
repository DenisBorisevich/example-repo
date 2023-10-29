package game;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Beowolf", 15);
        Hero mage = new Mage("Khadgar",17);
        Hero rouge = new Rouge("Altaris",13);
        Hero archer = new Archer("Sylvanas",5);

        Enemy enemy = new Enemy("Dummy",50);

        attackEnemy(enemy, warrior, mage, rouge, archer);

    }
    public static void attackEnemy(Enemy enemy, Hero...heroes){
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}

