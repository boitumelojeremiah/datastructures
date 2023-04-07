package com.jeremiah;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args){
        Queue<Person> bank = new LinkedList<>();
        bank.add(new Person("Otsile",33));
        bank.add(new Person("Lame",29));
        bank.add(new Person("Thapelo",20));

        System.out.println(bank.size());
        System.out.println(bank.peek());
        System.out.println(bank.poll());
        System.out.println(bank.size());
        System.out.println(bank.peek());
    }
    static record Person(String name, int age){}
}
