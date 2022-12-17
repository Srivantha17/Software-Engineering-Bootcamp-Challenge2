import java.util.Scanner;
import java.util.Stack;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input :");
        String s = scan.nextLine();

        boolean output = isValid(s);
        System.out.println("Output : " + output);

    }
    public static boolean isValid(String s) {

        Stack<Character> stringStack = new Stack<>();

        // convert String s to char array and loop through the Array by for each loop
        for (char c : s.toCharArray()) {

            //If left part of the parenthesis found
            if (c == '(' || c == '{' || c == '[') {
                stringStack.push(c);
            }
                // If right part of the parenthesis found
            else if (c == ')'  && stringStack.peek() == '(' ){
                stringStack.pop();
            } else if (c == '}'  && stringStack.peek() == '{' ){
                stringStack.pop();
            } else if (c == ']'  && stringStack.peek() == '[' ){
                stringStack.pop();
            }
            // If valid symbols is not found
            else {
                return false;
            }
        }
        return stringStack.isEmpty();
    }
}
