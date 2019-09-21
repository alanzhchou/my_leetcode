class Solution {
    public int reverse(int x) {
        boolean pos = false;
        int y = 0;
        if(x > 0){
            y = x;
            pos = true;
        }else if (x == -2147483648){
            return 0;
        }else {
            y = -x;
        }

        int last = 0;
        int rev = 0;
        while (y >= 10){
            last = y - y/10*10;
            y = (y - last) /10;
            rev = rev * 10 + last;
        }

        if(rev < 214748364){
            rev = rev * 10 + y;
            return pos ? rev : -rev;
        }else if(rev == 214748364 && x != -2147483648){
            rev = rev * 10 + y;
            return pos ? rev : -rev;
        }else {
            return 0;
        }
    }
}