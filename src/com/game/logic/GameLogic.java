package com.game.logic;

import java.util.Scanner;
import java.util.Random;

public class GameLogic {
 private int secretnumber ;
 private int attempts;


 public GameLogic(){
     Random R = new Random();
     secretnumber = R.nextInt(100)+1;
     attempts = 0;
 }
 public int PlayGame(){
    Scanner sc = new Scanner(System.in);
    while ( true) {
        System.out.println("enter your guess :");
        int guess = sc.nextInt();
        attempts++;

        if (guess > secretnumber) {
            System.out.println("guess is high");
        } else if (guess < secretnumber) {
            System.out.println("guess is low");
        } else {
            System.out.println("Correct !!");
            break;
        }

    }
      return attempts;
 }

}


