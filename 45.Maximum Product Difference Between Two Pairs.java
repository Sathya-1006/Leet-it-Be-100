//45.Leetcode
//1913. Maximum Product Difference Between Two Pairs

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int res = (nums[nums.length-1] * nums[nums.length- 2]) - (nums[0] * nums[1]);
         return res;
    }
}
