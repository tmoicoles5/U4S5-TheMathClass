package com.codedifferently.labs.partA;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int rounds = 10;
        for (int x = 0; x < rounds; x++) {
            int number = rand.nextInt(3);
            String result;
            if (number == 0)
                result = "rock";
            else if (number == 1) {
                result = "paper";
            } else {
                result = "scissors";
            }
            System.out.println("Round " + (x + 1) + ": " + result);
        }
    }
}