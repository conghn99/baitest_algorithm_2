import java.util.Stack;

public class _844 {
    public boolean backspaceCompare(String s, String t) {
        return compute(s).equals(compute(t));
    }

    public Stack<Character> compute(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
}
