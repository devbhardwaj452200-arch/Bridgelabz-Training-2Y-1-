package Recursion.BasicProgram;
public class MaximumElement {
    public static int max(int arr[], int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int small = max(arr, index + 1);
        return Math.max(arr[index], small);
    }
    public static void main(String[] args) {
        int arr[] = {10, 25, 7, 40, 15};
        System.out.println("Maximum element = " + max(arr, 0));
    }
}
