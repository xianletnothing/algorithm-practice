package com.company;

import java.lang.reflect.Array;
import java.util.Stack;

public class IsVaild {
    public boolean isVaild(String str) {
       if(str==""){
           return true;
       }
        if (str.length()%2 !=0) {
            return false;
        }
        Stack<Character> stack=new Stack();
       for (char c:str.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if (c=='['){
                stack.push(']');
            }
            else if (c=='{'){
                stack.push('}');
            }
            else if(!stack.isEmpty()&&stack.pop()==c){
                continue;
            }else {
                return false;
            }
        }
        if (stack.size()!=0) {
            return false;
        }else {
            return true;}

    }

}
