class Solution {
  public int[] twoSum(int[] numbers, int target) {
    for(int i = 0; i<numbers.length-1; i++) {
      for(int j = i+1; j<numbers.length; j++) {
        if((numbers[i] + numbers[j]) == target) {
          i++;
          j++;
          return new int[]{i,j};
        }
      }
    }
  return new int[]{-1,-1};
  }
}