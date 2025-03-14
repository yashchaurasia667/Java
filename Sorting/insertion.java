package Sorting;

public class insertion {
  public static void main(String[] args) {
    int arr[] = { 5, 4, 3, 2, 1 };

    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      int prev;
      for (prev = i - 1; prev >= 0 && arr[prev] > curr; prev--) {
        arr[prev + 1] = arr[prev];
      }
      arr[prev + 1] = curr;
      // arr[curr] = arr[prev + 1];
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
