package Sorting;

public class bubble {
  public static void main(String[] args) {
    int arr[] = { 5, 1, 4, 3, 10, 11 };

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // arr[j] = arr[j] + arr[j + 1];
          // arr[j + 1] = arr[j] - arr[j + 1];
          // arr[j] = arr[j] - arr[j + 1];
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}