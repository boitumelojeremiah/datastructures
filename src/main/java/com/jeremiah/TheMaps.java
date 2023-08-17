package com.jeremiah;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person("Lame"));
        map.put(2,new Person("Bubbles"));
        map.put(3, new Person("B2"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));

        map.entrySet().forEach(System.out::println);
    }
    record Person(String name){}
}
