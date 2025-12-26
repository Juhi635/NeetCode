// NeetCode Roadmap: Arrays & Hashing
// https://leetcode.com/problems/two-sum/
// Time: O(n), Space: O(n)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
