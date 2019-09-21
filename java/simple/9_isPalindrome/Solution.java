class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x%10 == 0)){
            return false;
        }

        int y = x;
        int last = 0;
        int rev = 0;
        while (y >= 10){
            last = y - y/10*10;
            y = (y - last) /10;
            rev = rev * 10 + last;
        }
        rev = rev * 10 + y;

        return rev == x;
    }
}