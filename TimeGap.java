public class TimeGap {
  public static void main(String[] args) {
    int[][] time = {
      {0, 0, 0},
      {0, 1, 2},
      {0, 17, 42},
      {0, 44, 39},
      {1, 3, 10},
      {1, 17, 30},
      {1, 52, 18},
      {2, 11, 8},
      {2, 25, 42},
      {2, 34, 58},
      {2, 46, 55},
      {3, 16, 58},
      {3, 43, 58},
      {4, 15, 21},
      {4, 44, 36},
      {5, 7, 14},
      {5, 33, 49},
      {6, 7, 46},
      {6, 30, 21},
      {6, 31, 23}
    };
    for(int idx = 4; idx < time.length-1; idx++) {
      float time1 = (time[idx][0] * 60.0f) + time[idx][1] + (time[idx][2] / 60.0f);
      float time2 = (time[idx+1][0] * 60.0f) + time[idx+1][1] + (time[idx+1][2] / 60.0f);
      System.out.printf("<div class=\"incompleted\" style=\"width: calc(600px * calc(%.2f / 391.35))\"></div>\n", (time2 - time1));
    }
  }
}