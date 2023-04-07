package com.jeremiah;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);

        int[] numbers = {100,200};

        //looping the colors array
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        //reverse looping the colors array
        for (int i = colors.length-1;i>=0;i--){
            System.out.println(colors[i]);
        }

        //printing the length only of the colors array
        System.out.println(colors.length);

        //enhanced looping of the colors array
        for (String color : colors){
            System.out.println(color);
        }

        //using a stream loop
        Arrays.stream(colors).forEach(System.out::println);
    }
}