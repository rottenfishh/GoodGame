package ru.nsu.kolodina.game.entity;

import java.util.Random;

public class Cube {
    Random rand = new Random();

    public int throwCube() {
        return rand.nextInt(1,6);
    }

    public boolean throwCubeForAttack(int tries) {
        for (int i = 0; i < tries; i++) {
            int value = throwCube();
            if (value >=5) {
                return true;
            }
        }
        return false;
    }
}
