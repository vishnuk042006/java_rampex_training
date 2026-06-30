package day07;

public class moveszeros  {
    public static void main(String[] args) {
        int[] arr = {2, 0, 3, 0, 5};
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}