package com.tlglearning;

public class FizzBuzz {

  public static final String FIZZ_RESULT = "fizz"; //this is a constant
  public static final String BUZZ_RESULT = "buzz"; //this is a constant

  public static String valueOf(int num) { //the return type is String
    String result = "";
    if (num % 3 == 0) {//IF is always followed by parentheses
      result = FIZZ_RESULT; //+= is the same as inputting -->... result = result +
    }
    if (num % 5 == 0) {
      result += BUZZ_RESULT;
    } // result is an instance of the String class
    if (result.isEmpty()) {//invoking isEmpty
      result = String.valueOf(num); //this is a static method of the String class
    }
    return result;
  }

}
