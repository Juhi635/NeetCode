// LeetCode 209: Minimum Size Subarray Sum
// NeetCode Roadmap: Sliding Window (Variable Size)
// https://leetcode.com/problems/minimum-size-subarray-sum/
// Time: O(n), Space: O(1)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
