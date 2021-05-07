package com.lcs.leetcode.stringdispose;

import java.util.ArrayList;
import java.util.List;

public class medium_PartitionLabels {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 9, 13, 21, 37};
        int targetNum = 28;
        System.out.println(findNums(targetNum, nums).toString());
    }
    public static List<Integer> findNums(int targetNum, int[] nums) {
            for(int i = 0, j = nums.length - 1; i <= j ;){
                if (nums[i] + nums[j] > targetNum) {
                    j --;
                } else if (nums[i] + nums[j] < targetNum) {
                    i++;
                } else {
                    List<Integer> resultList = new ArrayList<>();
                    resultList.add(i);
                    resultList.add(j);
                    return resultList;
                }
            }
            return null;
    }
}
