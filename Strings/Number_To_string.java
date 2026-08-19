class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        long num = 0; 

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        // Read digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;
            long result = num * sign;

            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        
        return (int)(num * sign);
    }
}