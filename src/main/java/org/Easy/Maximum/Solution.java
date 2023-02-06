package org.Easy.Maximum;

public class Solution {
  public int maxSubArray(int[] nums) {
    int sum = 0, maxSum = Integer.MIN_VALUE;
    for (int num : nums) {
      //循环数组选取大的
      sum = Math.max(sum,0) + num;
      //对比数据最大的数据边界
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }
}
