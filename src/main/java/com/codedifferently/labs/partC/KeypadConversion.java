package com.codedifferently.labs.partC;


import java.util.Scanner;

public class KeypadConversion {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter you keypad numbers:");

        String message = myScan.nextLine().toLowerCase(); //Converting message into lowercase letters

        System.out.println("Keypad sequence:" + convertToKeypad(message));

        myScan.close();
    }

    public static String convertToKeypad(String message) {
        String[] keypad = {
                "2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999"

        }; //An array that implements numbers to letters
            // Maps the array

        StringBuilder result = new StringBuilder();// StringBuilder creates an object.

        for(char c : message.toCharArray()){
            if (c>= 'a'&& c<='z'){
                result.append(keypad[c-'a']);
            }
        }

        return result.toString();
    }



}