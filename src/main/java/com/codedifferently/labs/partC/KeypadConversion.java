package com.codedifferently.labs.partC;


import java.util.Scanner;

public class KeypadConversion {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter you keypad numbers:");

        String message = myScan.nextLine().toLowerCase(); //Converting message into lowercase letters

        System.out.println("Keypad sequence:"+convertToKeypad(message));

    myScan.close();
    }
}
