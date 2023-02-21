class Solution {
  public int maximumWealth(int[][] accounts) {
      int larg = 0;
      int m = accounts.length;
      for(int i = 0; i<m; i++) {
           int max = 0;
          for(int j = 0; j<accounts[i].length; j++) {
               max = max + accounts[i][j];
          }
          if(larg <= max) {
          larg = max;
          }
      }
       return larg;
  }
 
}