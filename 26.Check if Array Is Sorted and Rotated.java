//26.LeetCode - optimal
//1752. Check if Array Is Sorted and Rotated

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        // Traverse through the array and count the number of places where order breaks
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        
        // For a rotated sorted array, there should be at most one place where order breaks
        return count <= 1;
    }
}


