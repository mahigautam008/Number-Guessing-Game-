package com.game.main;

import com.game.logic.GameLogic;
import com.game.model.Data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game !! [1-100]");
        System.out.println("Want a menu bar :");
        String ans = sc.next();
        Data scoremanager = new Data();
        int choice;
        if (ans.equalsIgnoreCase("Yes")) {
            do {
                choice();

                System.out.println("choose a number :");
                choice = sc.nextInt();


                if (choice == 1) {
                    GameLogic game = new GameLogic();
                    int attempts = game.PlayGame();
                    System.out.println("your attempts are :" + attempts);

                    int score = scoremanager.CalculateScore(attempts);
                    System.out.println("Your score is : " + score);

                    scoremanager.UpdateBestScore(score);

                } else if (choice == 2) {



                    System.out.println("The Best Score is :" + scoremanager.getBestscore());


                } else if (choice == 3) {
                    System.out.println("Game is restarted");
                    GameLogic game = new GameLogic();

                } else if (choice == 4) {
                    System.out.println("Thanks !!");
                } else {
                    System.out.println("Choose a valid number");
                }
            }  while (choice != 4) ;

        }
        else {
            System.out.println("You are exit now!!");
        }


    }



    static void choice (){
        System.out.println("1. Play Game");
        System.out.println("2. Score ");
        System.out.println("3. Restart");
        System.out.println("4. Exit");

    }
}
