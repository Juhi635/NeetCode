// LeetCode 217: Contains Duplicate
// NeetCode Roadmap: Arrays & Hashing
// https://leetcode.com/problems/contains-duplicate/
// Time: O(n), Space: O(n)

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
