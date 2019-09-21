class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length()%2 == 1){
            return false;
        }
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.empty()){
                if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}'){
                    return false;
                }else {
                    stack.push(chars[i]);
                }
            }else {
                char top = stack.peek();
                if (chars[i] == ')' && top == '('){
                    stack.pop();
                }else if (chars[i] == ']' && top == '['){
                    stack.pop();
                }else if (chars[i] == '}' && top == '{'){
                    stack.pop();
                }else {
                    stack.push(chars[i]);
                }
            }
        }
        return stack.empty();
    }
}