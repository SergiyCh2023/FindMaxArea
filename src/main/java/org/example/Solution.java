package org.example;

public class Solution {

    public int findMaxArea(int [] array) {

        if (array.length == 1) throw new OneElementException();

        int tempArea = 0;
        int maxArea = 0;

        for (int i = 0; i < array.length-1; i++) {

            for (int j = 1; j < array.length; j++) {


                tempArea = returnMinValueFromTwo(array[i], array[j+i]) * j;
                if (tempArea > maxArea) maxArea = tempArea;
                if (j+i+1 >= array.length) break;

            }

        }

        return maxArea;
    }


    private int returnMinValueFromTwo(int a, int b) {
        if (a > b) return b;
        else return a;
    }

}
