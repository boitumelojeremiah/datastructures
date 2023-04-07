package com.jeremiah;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors.size());
        System.out.println(colors.contains("Green"));
        System.out.println(colors.contains("Black"));
        System.out.println(colors);
    }
}
