import java.util.*;

public class ValidParenthesis {

    public boolean isValid(String s){

        Stack<Character> leftSide = new Stack<>();
    
    for(char c : s.toCharArray()){

        if(c == '(' || c == '{' || c == '['){
            leftSide.push(c);
        }

        else if(c == ')' && !leftSide.isEmpty() && leftSide.peek() == '('){
            leftSide.pop();
        } else if(c == '}' && !leftSide.isEmpty() && leftSide.peek() == '{'){
            leftSide.pop();
        }else if( c == ']' && !leftSide.isEmpty() && leftSide.peek() == '['){
            leftSide.pop();
        }
        else {
            return false;
        }
    }
                                    
    return leftSide.isEmpty();

    }



    
}
