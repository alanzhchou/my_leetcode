class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        int leastLength = Integer.MAX_VALUE;
        int leastLengthIndex = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= leastLength){
                leastLength = strs[i].length();
                leastLengthIndex = i;
            }
        }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < leastLength; i++) {
            boolean same = true;

            for (int j = 0; j < strs.length-1; j++) {
                if (strs[j].charAt(i) != strs[j+1].charAt(i)){
                    same = false;
                    break;
                }
            }

            if (same){
                buffer.append(strs[leastLengthIndex].charAt(i));
            }else {
                break;
            }
        }
        return buffer.toString();
    }
}