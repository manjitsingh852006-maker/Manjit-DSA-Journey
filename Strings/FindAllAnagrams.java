import java.util.*;

class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] count = new int[26];

        for(char ch : p.toCharArray()){
            count[ch - 'a']++;
        }


        int left = 0;

        int[] window = new int[26];


        for(int right = 0; right < s.length(); right++){

            window[s.charAt(right) - 'a']++;


            if(right - left + 1 > p.length()){

                window[s.charAt(left) - 'a']--;
                left++;

            }


            if(Arrays.equals(count, window)){

                result.add(left);

            }
        }


        return result;
    }
}