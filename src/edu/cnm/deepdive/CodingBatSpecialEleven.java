package edu.cnm.deepdive;

/*
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
Return true if the given non-negative number is special.

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
 */

public class CodingBatSpecialEleven {

  public static void main(String[] args) {

    System.out.printf("with the number %s, the outcome is " + specialEleven(22) + "\n", 22);
    System.out.printf("with the number %s, the outcome is " + specialEleven(23) + "\n", 23);
    System.out.printf("with the number %s, the outcome is " + specialEleven(24) + "\n", 24);

  }

  public static boolean specialEleven(int n) {
    return (n % 11 == 0 || (n - 1) % 11 == 0);
  }

}
