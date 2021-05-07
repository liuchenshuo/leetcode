package com.lcs.leetcode.boundary;

public class medium_DailyTemperatures_739 {
    public static void main(String[] args) {
        medium_DailyTemperatures_739 problem = new medium_DailyTemperatures_739();
        int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(problem.dailyTemperatures(input).toString());
    }

    public int[] dailyTemperatures(int[] T) {
        int[] toHighDay = new int[T.length];
        int[] numStart = new int[101];
        numStart[T[T.length - 1]] = T.length - 1; // last num
        for (int i = T.length - 2 ; i >=0; i--) {
            numStart[T[i]] = i;
            toHighDay[i] = getHighDay(numStart,i,T[i]);
        }
        return toHighDay;
    }


    private int getHighDay(int[] numStart, int index, int currNum) {
        int highDay = 0;
        for (int i = currNum; i < numStart.length; i++) {
            if (numStart[i] > 0) {
                if (i > currNum) {
                    if (numStart[i] > index) {
                        if (highDay > 0) {
                            highDay = Math.min(numStart[i], highDay);
                        } else {
                            highDay = numStart[i];
                        }
                    }
                }
            }
        }
        if (highDay > 0) {
            highDay = highDay - index;
        }
        return highDay;
    }
}
