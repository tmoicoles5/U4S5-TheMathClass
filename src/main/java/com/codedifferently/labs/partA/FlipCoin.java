package com.codedifferently.labs.partA;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        String result;
        if (chance < 0.5) result = "Heads";
        else result = "Tails";
        System.out.println("The result is : " + result);
        //if statement gives a random result of "Heads" or "Tails";
    }
}
