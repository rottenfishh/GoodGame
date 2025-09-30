package ru.nsu.kolodina.game;

import ru.nsu.kolodina.game.controller.UserInputController;
import ru.nsu.kolodina.game.entity.Monster;
import ru.nsu.kolodina.game.entity.Player;
import ru.nsu.kolodina.game.service.GameLogic;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GameLogic logic = new GameLogic();
        UserInputController userInput = new UserInputController();
        Monster monster = new Monster(10, 50, 100, 10, 15);
        Player player = userInput.createPlayerCharacter();
        System.out.println("Monster attacked!");
        do {
            if (monster.doAttack()) {
                if (logic.attack(monster, player)) {
                    System.out.println("Monster dealt you a blow!");
                } else {
                    System.out.println("Monster misses!");
                }
            }
            String decision = userInput.readPlayerInputDecision();
            if (decision.equals("heal")) {
                player.heal();
            }
            if (decision.equals("attack")) {
                if (logic.attack(player, monster)) {
                    System.out.println("Blow landed successfully!");
                } else {
                    System.out.println("You missed...");
                }
            }
        } while (monster.alive && player.alive);

        if (!monster.alive) {
            System.out.println("You won!");
        } else {
            System.out.println("You died...");
        }
    }
}