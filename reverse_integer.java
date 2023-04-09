class Solution {
    public int reverse(int x) {
        long ans = 0;
        while(x != 0){
            int r = x % 10;
            ans += r;
            ans *= 10;
            x /= 10;
        }
        ans /= 10;
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }
}
