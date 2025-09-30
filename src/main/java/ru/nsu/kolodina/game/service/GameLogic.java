package ru.nsu.kolodina.game.service;

import ru.nsu.kolodina.game.entity.Creature;
import ru.nsu.kolodina.game.entity.Cube;

import java.util.Random;

public class GameLogic {
    Cube cube = new Cube();
    Random rand = new Random();

    public boolean attack(Creature attacker, Creature defender) {
        int attackModificator = attacker.attackStat - defender.defenseStat + 1;
        int attackValue = 0;
        if (cube.throwCubeForAttack(attackModificator)) {
            attackValue = rand.nextInt(attacker.damageRange[0], attacker.damageRange[1]+1);
            defender.health -= attackValue;
            return true;
        }
        return false;
    }
}
