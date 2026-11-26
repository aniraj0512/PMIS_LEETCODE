
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String a = "";
        String original = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                original += ch;
            }
        }

        for (int n = original.length() - 1; n >= 0; n--) {
            char ch = original.charAt(n);
            a += ch;
        }

        return original.equals(a);
    }
}
