package com.jeremiah;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String [] args){
        int data[] = new int[10];
        Random random = new Random(); //a pseudo random number generator
        random.setSeed(System.currentTimeMillis()); //use current as seed
        //fill the data array with psudo-random numbers from 0-99, inclusive
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(100); //the next pseudo-random number
            int[] orig = Arrays.copyOf(data, data.length); //make a copy of the data array
            System.out.println("arrays equal before sort: "+Arrays.equals(data,orig));
            Arrays.sort(data); //sort the data array (orig remains unchanged)
            System.out.println("arrays equal before sort: "+Arrays.equals(data,orig));
            System.out.println("orig = "+Arrays.toString(orig));
            System.out.println("data = "+Arrays.toString(data));
        }

    }
}
