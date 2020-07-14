package com.lcs.leetcode.stringdispose;

import java.util.ArrayList;
import java.util.List;

public class medium_PartitionLabels {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
    public static List<Integer> partitionLabels(String word) {
        List<Integer> resultList = new ArrayList<>();
        // get index list
        // warning : can't use string.indexOf this method time is O(n)
        int[] wordLastIndex = new int[26];
        char[] wordChar = word.toCharArray();
        for (int i = 0; i<wordChar.length;i++) {
            wordLastIndex[wordChar[i] -'a'] = i;
        }
        int target = 0;
        boolean weatherStart = true;
        int startIndex = 0;
        for (int i = 0; i < wordChar.length; i++) {
            if (weatherStart) {
                target = wordLastIndex[wordChar[i] - 'a'];
                startIndex = i;
                weatherStart = false;
            }
            int currLast = wordLastIndex[wordChar[i] - 'a'];
            if (currLast > target) {
                target = currLast;
            }
            if (i == target) {
                resultList.add(target - startIndex + 1);
                weatherStart = true;
            }
        }
        return resultList;
    }
}
