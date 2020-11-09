package com.company;

import java.util.Arrays;

//Implementation of a Dynamic Array
public class DynamicArray {

    //Initiating the variables
    private int [] data;
    private int size;

    //Initiating the Constructor
    public DynamicArray(){
        data = new int [16];
        size = 0;
    }

    //Initiating the Overloaded Constructor
    public DynamicArray(int capacity){
        if(capacity < 16){
            capacity = 16;
            data = new int[capacity];
            size = 0;
        }
    }

    //Checking to make sure the index is within the range
    public void rangeCheck(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index : " + index +
                    " , size : " + size);
        }
    }

    //Get the element at that specific index
    public int get(int index){
        rangeCheck(index);
        return data[index];
    }

    //Setting an element at a specific index
    public int set(int index,int element){
        rangeCheck(index);
        int original = data[index];
        data[index] = element;
        return original;
    }

    //Ensuring the capacity is enough to hold all the elements
    //If not increase the range of the elements to hold
    public void ensureCapacity(int minCapacity){
        int oldCapacity = data.length;
        if(oldCapacity < minCapacity){
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data,newCapacity);
        }
    }

    // Adding elements to the end of the array
    public boolean add(int element){
        ensureCapacity(size + 1);
        data[size ++] = element;
        return true;
    }

    // check if array is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // Return the size of the array
    public int size(){
        return size ;
    }

    //Clear all the elements from the array
    public void clear(){
        size = 0;
    }
}