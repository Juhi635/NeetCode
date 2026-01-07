// LeetCode 238: Product of Array Except Self
// NeetCode Roadmap: Arrays & Hashing
// https://leetcode.com/problems/product-of-array-except-self/
// Time: O(n), Space: O(1) extra (excluding output array)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }
}
