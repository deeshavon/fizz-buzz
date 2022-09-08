package com.tlglearning;

import java.util.Set;

public class Main {

  public static void main(String[] args) { //this is a declaration method, the psvm inputs. I'm going to invoke...in braces{} this is implementation
    int i = 1;
    do {   //using a block compound statement in the braces {} //line 6 above is a "for loop" line of code
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.printf("%d: %s%n", i, value);
      if (value.equals("fizzbuzz")) {
        break;
      }
      i++;
    } while (i <= 100);
  }

}
