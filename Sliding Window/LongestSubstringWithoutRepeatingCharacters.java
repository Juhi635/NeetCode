// LeetCode 3: Longest Substring Without Repeating Characters
// NeetCode Roadmap: Sliding Window (Variable Size)
// Time: O(n)
// Space: O(1)

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // Shrink window until duplicate removed
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
