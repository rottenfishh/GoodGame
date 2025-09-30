package ru.nsu.kolodina.game.entity;

public class Player extends Creature {
    int maxHeals = 4;
    int heals = 0;

    public Player(int attackStat, int defenseStat, int health, int damageLeast, int damageMost) {
        super(attackStat, defenseStat, health, damageLeast, damageMost);
    }

    public void heal() {
        if (heals <= maxHeals) {
            heals++;
            this.health += (int) (this.health * 0.3);
        } else {
            System.out.println("You cannot heal yourself anymore...");
        }
    }
    public void makeDecision(String decision) {

    }
}
