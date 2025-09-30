package ru.nsu.kolodina.game.entity;

import java.util.Random;

public class Monster extends Creature {
    Random rand = new Random();
    int gameStep = 0;

    public Monster(int attackStat, int defenseStat, int health, int damageLeast, int damageMost) {
        super(attackStat, defenseStat, health, damageLeast, damageMost);
    }

    public boolean doAttack() {
        return rand.nextBoolean(); // monster lands blow randomly
    }
}
