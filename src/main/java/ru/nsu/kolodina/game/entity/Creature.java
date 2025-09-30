package ru.nsu.kolodina.game.entity;

import ru.nsu.kolodina.game.util.Data;

public class Creature {
    public int attackStat;
    public int defenseStat;
    public int health;
    public int[] damageRange = new int[2];
    public boolean alive;

    public Creature(int attackStat, int defenseStat, int health, int damageLeast, int damageMost) {
        this.alive = true;
        if (Data.validateData(1, 30, attackStat, "attack"))
            this.attackStat = attackStat;
        if (Data.validateData(1, 30, defenseStat, "defense"))
            this.defenseStat = defenseStat;
        if (Data.validateData(1, Integer.MAX_VALUE, health, "health"))
            this.health = health;

        if (damageLeast > damageMost) {
            System.err.println("Incorrect damage range!");
        } else {
            this.damageRange[0] = damageLeast;
            this.damageRange[1] = damageMost;
        }
    }

    public boolean dies() {
        if (health == 0) {
            this.alive = false;
        }
        return this.alive;
    }
}
