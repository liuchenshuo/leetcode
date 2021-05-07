# 双指针 Double pointer （项目包名：doublepointer）
## 解题思路

使用双指针，一个指针指向开始，一个指针指向末尾，一般是两个指针分别向中间移动遍历。

值较小的元素，一个指针指向值较大的元素。指向较小元素的指针从头向尾遍历，
指向较大元素的指针从尾向头遍历。
* 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
* 如果 sum > target，移动较大的元素，使 sum 变小一些；
* 如果 sum < target，移动较小的元素，使 sum 变大一些。  
**算法分析**  
数组中的元素最多遍历一次，时间复杂度为 O(N)。只使用了两个额外变量，空间复杂度为 O(1)。
## 典型题目
#### 1 有序数组的 Two Sum
* (easy_TwoNumSum_two)  leetcode 168
#### 2 最长子序列 Longest Word in Dictionary through Deleting
* (medium_LongestSunString)
