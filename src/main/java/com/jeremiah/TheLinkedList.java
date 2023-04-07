package com.jeremiah;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args){
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Saka", 20));
        linkedList.add(new Person("Martinelli",21));
        linkedList.add(new Person("Saliba", 21));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    static record Person(String name, int age){}
}
