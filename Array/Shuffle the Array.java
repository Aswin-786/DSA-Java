class Solution {
  public int[] shuffle(int[] nums, int n) {

      int [] arr = new int [2*n];
      int s=0;
      int f=1;
      for (int i = 0; i<n; i++){
          arr[s] = nums[i];
          arr[f] = nums[i+n];
          s += 2;
          f += 2;
      }
      return arr;
  }
}