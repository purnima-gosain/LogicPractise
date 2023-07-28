import java.util.*;

public class ValidParenthesis {

    public boolean isValid(String s){

        Stack<Character> leftSide = new Stack<>();
    
    for(char c : s.toCharArray()){

        if(c == '(' || c == '{' || c == '['){
            leftSide.push(c);
        }

        else if(c == ')' && !leftSide.isEmpty() && leftSide.peek() == '('){
            System.out.println("True");
            leftSide.pop();
        } else if(c == '}' && !leftSide.isEmpty() && leftSide.peek() == '{'){
            leftSide.pop();
        }else if( c == ']' && !leftSide.isEmpty() && leftSide.peek() == '['){
            leftSide.pop();
        }
        else {
            System.out.println("False");
            return false;
        }
    }
                                    
    return leftSide.isEmpty();

    }

    public static void main(String[] args){
        ValidParenthesis paren = new ValidParenthesis();
        paren.isValid("(]");
    }

    
}
