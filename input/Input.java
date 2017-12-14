package kea.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

  public static int intInput(String message, String errorMessage) {
    int result = 0;
    try {
      System.out.print(message);
      result = (new Scanner(System.in)).nextInt();
    } catch (InputMismatchException e) {
      System.out.println(errorMessage);
      result = intInput(message, errorMessage);
    }

    return result;
  }

  public static boolean booleanInput(String message, String errorMessage) {
    boolean result;
    try {
      System.out.print(message);
      result = (new Scanner(System.in)).nextBoolean();
    } catch (InputMismatchException e) {
      System.out.println(errorMessage);
      result = booleanInput(message, errorMessage);
    }

    return result;
  }

  private static String stringToBoolean(String message, String first, String second, String error) {
    System.out.print(message);
    String inputString = new Scanner(System.in).next();

    if (first.equalsIgnoreCase(inputString)) return first;
    if (second.equalsIgnoreCase(inputString)) return  second;

    System.out.println(error);
    return stringToBoolean(message, first, second, error);

  }
}