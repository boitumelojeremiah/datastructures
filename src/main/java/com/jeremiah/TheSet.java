package com.jeremiah;

import java.util.HashSet;
import java.util.Set;

public class TheSet {
    public static void main(String[] args){
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Red"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Orange"));
        balls.add(new Ball("Yellow"));
        balls.forEach(System.out::println);
        System.out.println(balls.size());
    }
    record Ball(String color){}
}
