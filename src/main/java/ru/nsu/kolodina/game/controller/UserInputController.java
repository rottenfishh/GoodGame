package ru.nsu.kolodina.game.controller;

import ru.nsu.kolodina.game.entity.Player;

import java.util.Scanner;

public class UserInputController {

    Scanner scanner = new Scanner(System.in);

    public Player createPlayerCharacter() {
        System.out.println("Enter player stats in 5 numbers: attack, defense, health, damage range: from n to m");
        System.out.println("Example: 30 20 60 10 20");
        int[] answers = new int[5];
        for (int i = 0; i < 5; i++) {
            answers[i] = scanner.nextInt();
        }
        String trash = scanner.nextLine(); // eat \n
        return new Player(answers[0], answers[1], answers[2], answers[3], answers[4]);
    }

    public String readPlayerInputDecision() {
        System.out.println("Attack or heal?");
        String answer = scanner.nextLine().toLowerCase();
        if (!(answer.equals("heal") || answer.equals("attack"))) {
            System.out.println("Invalid input, try again");
            return readPlayerInputDecision();
        }
        return answer.toLowerCase();
    }

}
