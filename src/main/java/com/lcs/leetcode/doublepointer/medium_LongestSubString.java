package com.lcs.leetcode.doublepointer;

import java.util.Arrays;
import java.util.List;

public class medium_LongestSubString {
    public static void main(String[] args) {
        medium_LongestSubString run = new medium_LongestSubString();
        String s = "abpcplea";
        String[] d = {"ale","apple","monkey","plea"};
        System.out.println(run.findLongestWord(s, Arrays.asList(d)));
    }

    public String findLongestWord(String s, List<String> d) {
        char[] inputStr = s.toCharArray();
        String reLongestStr = "";
        for (String str : d) {
            if (weatherExist(inputStr, str)) {
                if (reLongestStr.isEmpty()) {
                    reLongestStr = str;
                } else {
                    if (str.length() > reLongestStr.length()) {
                        reLongestStr = str;
                    } else if (str.length() == reLongestStr.length() && str.compareTo(reLongestStr) < 0) {
                        reLongestStr = str;
                    }
                }
            }
        }
        return reLongestStr;
    }

    // use two loop
    private boolean weatherExist(char[] inputStr, String currStr) {
        boolean exist = false;
        char[] currStrs = currStr.toCharArray();
        int currPoint = 0;
        int rightCount = 0;
        for (char word : currStrs) {
            while (currPoint < inputStr.length) {
                if (inputStr[currPoint++] == word) {
                    rightCount ++;
                    break;
                }
            }
        }
        if (rightCount == currStrs.length) {
            exist = true;
        }
        return exist;
    }

    // use two point
    private boolean isSubstr(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }

}
