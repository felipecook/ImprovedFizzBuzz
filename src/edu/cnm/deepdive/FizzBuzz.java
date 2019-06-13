package edu.cnm.deepdive;

public class FizzBuzz {

  public String[] fizzBuzz(int start, int end) {

    int arraySize = end - start;

    String[] returnStringArray = new String[arraySize];

    for (int i = 0; i < arraySize; i++) {
      if (start % 15 == 0) {
        returnStringArray[i] = "FizzBuzz";
      } else if (start % 3 == 0) {
        returnStringArray[i] = "Fizz";
      } else if (start % 5 == 0) {
        returnStringArray[i] = "Buzz";
      } else {
        returnStringArray[i] = String.valueOf(start);
      }
      start++;
    }

    return returnStringArray;

  }

}
