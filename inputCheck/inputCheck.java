package kea.inputCheck;
import java.util.InputMismatchException;
import java.util.Scanner;

public class inputCheck {
public static int Int(String message, String errorMessage){
  int result = 0;
  try {
    System.out.print(message);
    result = (new Scanner(System.in)).nextInt();
  } catch (InputMismatchException e) {
    System.out.println(errorMessage);
    result = Int(message, errorMessage);
  }

  return result;
}

public static boolean Boolean(String message, String errorMessage){
  boolean result;
  try {
    System.out.print(message);
    result = (new Scanner(System.in)).nextBoolean();
  } catch (InputMismatchException e) {
    System.out.println(errorMessage);
    result = Boolean(message, errorMessage);
  }

  return result;
}
}
