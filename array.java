package com.craig.arrays;

public class Main {
  public static void main {
    float[] theVals = new float[3];

    theVals[0] = 10.0f;
    theVals[1] = 20.0f;
    theVals[1] = 15.0f;

    // or ( short hand )

    float[] theVals = { 10.0f, 20.0f, 15.0f }

    float sum = 0.0f;

    for(int i = 0; i < theVals.length; i++)
        sum += theVals[i];

    System.out.println(theVals);
  }
}
