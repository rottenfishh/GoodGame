package ru.nsu.kolodina.game.util;

public class Data {
    public static boolean validateData(int leftBorder, int rightBorder, int value, String name) {
        if (leftBorder <= value && value <= rightBorder) {
            return true;
        } else {
            System.out.println("Invalid value for" + name);
            return false;
        }
    }
}
