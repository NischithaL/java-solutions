class Solution {
    public String removeCharacter(String s, int pos) {
        if (pos < 0 || pos >= s.length()) return s;
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
