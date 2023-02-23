class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.sqrt(num);
        if((x / (int) x) == 1) {
            return true;
        }
        return false;
    }
}