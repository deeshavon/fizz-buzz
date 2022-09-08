package com.tlglearning;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {

  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int num) { //the return type is String
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    if (num % 3 == 0) {//IF is always followed by parentheses
      result.add(FIZZ); //+= is the same as inputting -->... result = result +
    }
    if (num % 5 == 0) {
      result.add(BUZZ);
    } // result is an instance of the String class
    return result;
  }

}
