package com.company;

public class Main {

    public static void main(String[] args) {
        // Demonstration of the Dynamic Array implementation
        DynamicArray sampleArray = new DynamicArray();
        for(int i=10; i>0; i--){
            sampleArray.add(i);
        }
        for(int i=0; i<10; i++){
            System.out.println("Index : " + i  + " Element  : " + sampleArray.get(i));
        }
        System.out.println("The size of this array is " + sampleArray.size());
    }
}