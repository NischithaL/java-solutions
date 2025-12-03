class Solution {
    public static int lengthString(String str) {
        int count = 0;
        for (char c : str.toCharArray()) count++;
        return count;
    }
}
