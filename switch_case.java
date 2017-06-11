package com.craig.calcengine;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a number of icecream flavors");
    int numberOfFlavors = keyboard.nextInt( );

    Switch (numberOfFlavors)
    {
      case 32:
           System.out.println("Nice selection");
           break;
      case 1:
           System.out.println(" I bet it's vanilla");
      case 2:
      case 3:
      case 4:
           System.out.println(numberOfFlavors + " flavors");
           System.out.println("is acceptable");
           break;
      default:
           System.out.println(" I didn't plan for");
           System.out.println(numberOfFlavors + " flavors");
           break;
    }
  }
}
