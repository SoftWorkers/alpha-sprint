package com.wmw;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,5,8,2,3,0,9,4,10};
        for(int i=0;i<numbers.length-1;i++) {
            for(int j=0;j<numbers.length-1-i;j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序结果是:");
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
