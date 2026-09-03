// Brute force time complexity is O(n) and space complexity is O(n) my approach is to print the last d elements first and then print the first n-d elements.

// import java.util.*;

// class Main{
//     public static void main (String args[]){
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the size of array");
//      int n =sc.nextInt();
//      int arr[] =new int [n];
//      for (int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
      
//      }
//      System.out.println("Enter the number of rotations");
//         int d =sc.nextInt();
    
//         for (int i=n-1;i>=n-d;i--){
//             System.out.print(arr[i]+" ");
//         }
//         for(int i=0;i<n-d;i++){
//             System.out.print(arr[i]+" ");
//         }

//      }

// }

// better appraoch 0(n) time complexity and O(d) space complexity as d%n reduce space and time complexity is O(n) and space complexity is O(d) my approach is to store the last d elements in a temporary array and then shift the first n-d elements to the right and then copy the temporary array to the first d elements of the original array.

// import java.util.*;

// class Main {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int a[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int d = sc.nextInt();

       
//         d = d % n;

//         int temp[] = new int[d];

       
//         for (int i = n - d; i < n; i++) {
//             temp[i - (n - d)] = a[i - (n - d)];
//         }

        
//         for (int i = 0; i < n - d; i++) {
//             a[i] = a[i + d];
//         }

       
//         for (int i = n - d; i < n; i++) {
//             a[i] = temp[i - (n - d)];
//         }

        
//         for (int i = 0; i < n; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }


// another and optimal approach is to reverse the first d elements and then reverse the last n-d elements and then reverse the whole array. Time complexity is O(n) and space complexity is O(1).
import java.util.*;

class Main {

    // Function to reverse array from start to end
    static void reverse(int a[], int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        // Reduce unnecessary rotations
        d = d % n;

        
        reverse(a, 0, d - 1);

        
        reverse(a, d, n - 1);

        
        reverse(a, 0, n - 1);

        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}