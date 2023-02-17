package com.datastruture;

import java.util.LinkedList;

public class PopAndPeek {
    public static void main(String[] args) {
            LinkedList<Integer> stack = new LinkedList<>();
            stack.push(70);
            stack.push(30);
            stack.push(56);
            System.out.println( "Print stack before pop");
            System.out.println(stack);

            System.out.println("pop =>" +stack.pop());
            System.out.println("pop =>" +stack.pop());
            System.out.println("pop =>" +stack.pop());

            System.out.println("print Stack after pop");
            System.out.println(stack);
            System.out.println("Number on top of the stack is =>" + stack.peek());


        }
    }


