class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int oldResult = result;

            if (i+1 < s.length()){
                result += switchTwo(chars[i],chars[i+1]);
                if (oldResult != result){
                    i++;
                }else {
                    result += switchSingle(chars[i]);
                }
            }else if (i < s.length()) {
                result += switchSingle(chars[i]);
            }
        }
        return result;
    }

    public int switchTwo(char first, char second){
        int result = 0;

        if (first == 'I'){
            if (second == 'V'){
                result += 4;
            }else if (second == 'X'){
                result += 9;
            }
        }else if (first == 'X'){
            if (second == 'L'){
                result += 40;
            }else if (second == 'C'){
                result += 90;
            }
        }else if (first == 'C'){
            if (second == 'D'){
                result += 400;
            }else if (second == 'M'){
                result += 900;
            }
        }
        return result;
    }

    public int switchSingle(char s){
        int result = 0;
        switch (s){
            case 'I':   result += 1;break;
            case 'V':   result += 5;break;
            case 'X':   result += 10;break;
            case 'L':   result += 50;break;
            case 'C':   result += 100;break;
            case 'D':   result += 500;break;
            case 'M':   result += 1000;break;
        }
        return result;
    }
}