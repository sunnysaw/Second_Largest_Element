import java.util.Scanner;
public class Main {
    public static int secondLargest(int[] nums) {
        // Your code goes here
        java.util.Arrays.sort(nums);
        int maxElemet = nums[nums.length - 1];
        int secLargest = Integer.MIN_VALUE;;
        for(int start = 0; start < nums.length; start++){
            if(secLargest < nums[start] && nums[start] != maxElemet){
                secLargest = nums[start];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int num = input.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the element inside array ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Printing the result ");
        System.out.println(secondLargest(array));
    }
}