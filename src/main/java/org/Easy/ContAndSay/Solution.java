package org.Easy.ContAndSay;

import org.junit.Test;

public class Solution {
  public static String  countAndSay(int n) {
    if (n == 1) {
      return "1";
    }
    StringBuilder cur = new StringBuilder();
    //递归
    String prev = countAndSay(n - 1);
    int count = 0;
    for (int i = 0; i < prev.length(); i++) {
      count++;
      //下一个字符不等于当前字符说明读到最后了
      if (i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {

        cur.append(count).append(prev.charAt(i));
        //归零
        count = 0;
      }
    }
    return cur.toString();
  }

}
