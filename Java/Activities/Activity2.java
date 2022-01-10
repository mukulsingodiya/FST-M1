package activities;

public class Activity2 {
    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};
        System.out.println("result: " + result(arr));
    }
    public static boolean result(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if (j == 10) {
                sum = sum + 10;
            }
        }
        return sum == 30;
    }
}

