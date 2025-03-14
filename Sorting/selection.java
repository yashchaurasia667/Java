package Sorting;

public class selection {
  public static void main(String[] args) {
    int arr[] = { 5, 3, 10, 7, 1, 9, 7, 3, 11, 25, 0 };
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minPos] > arr[j]) {
          minPos = j;
        }
      }
      int tmp = arr[i];
      arr[i] = arr[minPos];
      arr[minPos] = tmp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
