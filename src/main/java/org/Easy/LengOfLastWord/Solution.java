package org.Easy.LengOfLastWord;

public class Solution {
  public int lengthOfLastWord(String s) {
    int i = s.length() - 1, length = 0;
    //有空格了说明到最后一个单词了
    while (i >= 0 && s.charAt(i) == ' ') {
      i--;
    }
    while (i >= 0 && s.charAt(i) != ' ') {
      //逼近
      length++;
      i--;
    }
    return length;
  }
}
