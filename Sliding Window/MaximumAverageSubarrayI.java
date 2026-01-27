// LeetCode 643: Maximum Average Subarray I
// NeetCode Roadmap: Sliding Window (Fixed Size)
// https://leetcode.com/problems/maximum-average-subarray-i/
// Time: O(n), Space: O(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];      // add right
            windowSum -= nums[i - k];  // remove left
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
