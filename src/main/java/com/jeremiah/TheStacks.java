package com.jeremiah;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        //push adds items to a stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //view top item in stack
        System.out.println(stack.peek());
        //gets the size of the stack
        System.out.println(stack.size());
        //removes top item in stack
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
