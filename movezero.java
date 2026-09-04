// question in array move all zeroes to end look for all appraoch brute better and optimal approach
// time complexity is O(n) and space complexity is O(n).

// import java.util.*;

// class Main{
//     public static void main  (String [] args){
     
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int arr [] = new int [n];

//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int count =0;
//        int temp[] = new int [n];
//         for (int i=0;i<n;i++){
//             if (arr[i]!=0){
//                 temp[count]=arr[i];
//                 count++;
//             }
//         }
//         for (int i=0;i<n;i++){
//             System.out.print(temp[i]);
//         }
//     }
// }


// optimal approach is to use two pointer approach and swap the non zero elements with the zero elements and move the zero elements to the end of the array. time complexity is O(n) and space complexity is O(1).

import java.util.*;
class Main{
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr [] = new int [n];

    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int j=0;
    for (int i=0;i<n;i++){
        if (arr[i]!=0){
            

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
       
    }
    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
 }
}