// LeetCode 567: Permutation in String
// NeetCode Roadmap: Sliding Window (Fixed Size)
// Time: O(n)
// Space: O(1)

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Build initial window
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (matches(freq1, freq2)) return true;

        // Slide fixed-size window
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add new character
            freq2[s2.charAt(i) - 'a']++;

            // Remove leftmost character
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(freq1, freq2)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
