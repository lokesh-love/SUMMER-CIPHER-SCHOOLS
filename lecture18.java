import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        // Create an integer array of size n
        int[] arr = new int[n];
        
        // Prompt the user to enter the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter the " + (i+1) + "th element: ");
            arr[i] = sc.nextInt();
        }
        
        // Print the array elements
        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Close the Scanner
        sc.close();
    }
}
