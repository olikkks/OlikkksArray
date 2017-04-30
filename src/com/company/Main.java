package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];
        System.out.println("lenth= " + myArray.length);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println("i= " + myArray[i]);
        }


    }
}
