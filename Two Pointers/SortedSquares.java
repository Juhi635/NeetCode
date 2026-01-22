// LeetCode 977: Squares of a Sorted Array
// NeetCode Roadmap: Two Pointers
// https://leetcode.com/problems/squares-of-a-sorted-array/
// Time: O(n), Space: O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[idx] = leftSq;
                left++;
            } else {
                result[idx] = rightSq;
                right--;
            }
            idx--;
        }
        return result;
    }
}
