package com.craig.calcengine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a key:");
        int key = keyboard.nextInt( );

        switch (key + 1)
        // try changing the value in the switch statement and see what happens.
        {
            case 1:
                System.out.println("Apples");
                break;
            case 2:
                System.out.println("Oranges");
                break;
            case 3:
                System.out.println("Peaches");
                break;
            case 4:
                System.out.println("Plums");
                break;
            default:
                System.out.println("fruitless");
                break;
        }

    }
}
