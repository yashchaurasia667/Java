package Patterns;

public class pyramid {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        if (j > 4 - i)
          System.out.print(i + " ");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

}
