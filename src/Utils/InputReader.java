package Utils;

import java.util.Scanner;

public class InputReader {
  private static final Scanner scan = new Scanner(System.in);

  public static String getString() {
    return scan.nextLine();
  }

  public static int getInt() {
    return scan.nextInt();
  }

  public static double getDouble() {
    return scan.nextDouble();
  }

  public static void close() {
    scan.close();
  }
}
