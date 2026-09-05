// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

 

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
// Example 2:

// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.
// Example 3:

// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

// my approach is just to create an temp sorted array and use function to check if the original array is rotated or not. if the original array is rotated then return true else return false. time complexity is O(nlogn) and space complexity is O(n).


// class Solution {
//     public boolean check(int[] nums) {

//         // Step 1: Make a copy of original array
//         int[] num1 = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             num1[i] = nums[i];
//         }

//         // Step 2: Sort nums using bubble sort
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = 0; j < nums.length - 1 - i; j++) {

//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }

//         // Step 3: Try every possible rotation
//         for (int x = 0; x < nums.length; x++) {

//             boolean same = true;

//             for (int i = 0; i < nums.length; i++) {

//                 if (num1[i] != nums[(i + x) % nums.length]) {
//                     same = false;
//                     break;
//                 }
//             }

//             // If one rotation matches original array
//             if (same) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }
// ```

// optimal appraoch is that rotated array left element will be greater than right element and and right element will be  greater than left element only once  
class Solution {
    public boolean check(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}