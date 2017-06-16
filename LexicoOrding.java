package com.craig.lexoComparison;

public class Main {
  public static void main(String[] args) {
    String s1 = "y";
    String s2 = "a";

    // Lexicographic ordering ---> comparing strings by their position on the ASCII table
    if(s1.compareTo(s2) < 0)
       System.out.println(s1 + " precedes " + s2 + " in lexicographic ordering");
    else if(s1.compareTo(s2) > 0)
       System.out.println(s1 + " follows " + s2 + " in lexicographic ordering");
    else // s1.compareTo(s2) == 0
        System.out.println(s1 + " equals " + s2);
  }
}
