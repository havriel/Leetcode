package Algorithms;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String chars = "()[]{]";
        System.out.println(isValid(chars));
    }

    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else {
                if (charStack.empty()) {
                    return false;
                }
                if (c == ')' && charStack.peek() == '(') {
                    charStack.pop();
                } else if (c == '}' && charStack.peek() == '{') {
                    charStack.pop();
                } else if (c == ']' && charStack.peek() == '[') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        return charStack.empty();
    }
}
