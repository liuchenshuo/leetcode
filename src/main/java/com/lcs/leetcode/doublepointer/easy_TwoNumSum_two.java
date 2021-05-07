package com.lcs.leetcode.doublepointer;

import java.util.ArrayList;
import java.util.List;

public class easy_TwoNumSum_two {
    public static void main(String[] args) {
        int[] nums = {-2, 4,-5,2 ,-6 };
        easy_TwoNumSum_two easyTwoNumSumTwo = new easy_TwoNumSum_two();
        System.out.println(easyTwoNumSumTwo.solution(nums));
    }

    List<Integer> maxList = new ArrayList<>();
    List<Integer> tempList = new ArrayList<>();
    private List<Integer> solution(int[] nums) {
        dfs(nums, 0);
        return maxList;
    }

    private void dfs(int[] nums, int index) {
        if (index == nums.length) {
            return;
        }
        if (checkSum()) {
            maxList = new ArrayList<>(tempList);
        }
        tempList.add(nums[index]);
        dfs(nums, index + 1);
        tempList.remove(tempList.size() - 1);
        dfs(nums, index + 1);
    }

    private boolean checkSum() {
        int currMax = 1;
        for (Integer num : tempList) {
            currMax *= num;
        }
        int max = 1;
        for (Integer num : maxList) {
            max *= num;
        }
        return currMax > max;
    }
}
