package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;
public class Radius {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius = myScanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " +area);
        myScanner.close();
    }
}
