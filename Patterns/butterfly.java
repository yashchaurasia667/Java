package Patterns;

public class butterfly {
  public static void main(String[] args) {
    int height = 8;
    for (int i = 1; i <= height / 2; i++) {
      for (int j = 1; j <= height; j++) {
        if (j <= i || j > (height - i))
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    for (int i = height / 2; i > 0; i--) {
      for (int j = 1; j <= height; j++) {
        if (j <= i || j + i > height)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}
