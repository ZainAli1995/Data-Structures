package com.company;
import java.io.*;

public class LinkedList {
    Node head;

    public LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            head = newNode;
        }else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public void printList(LinkedList list){
        Node currNode = list.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("");
    }

    public LinkedList removeByKey(LinkedList list,int key){
        Node currNode = list.head;
        Node prev = null;

        //CASE 1 : If head itself holds the key to be deleted
        if (currNode != null && currNode.data == key){
            list.head = currNode.next;
            System.out.println(key + " found and deleted ");
            return list;
        }
        //CASE 2: Key is present somewhere other than at head
        while (currNode != null && currNode.data != key){
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null){
            prev.next = currNode.next;
            System.out.println(key + " found and deleted ");
        }

        //CASE 3: Key is not present
        if(currNode == null){
            System.out.println(key + " not found");
        }
        return list;
    }

    public LinkedList deleteAtPosition(LinkedList list, int index){
        Node currNode = list.head , prev = null;
        //CASE 1: if index is 0, then head node itself is to be deleted

        if(index == 0 && currNode != null){
            list.head = currNode.next;
            System.out.println(index + " position element deleted");
            return list;
        }
        //CASE 2: If the index is greater than 0 but less than the size of 1
        int counter = 0;

        while (currNode != null){
            if(counter == index){
                prev.next = currNode.next;
                System.out.println(index + " position element deleted");
                break;
            }else {
                prev = currNode;
                currNode = currNode.next;
                counter ++ ;
            }
        }
        //CASE 3: The index is greater the size of the LinkedList
        if(currNode == null){
            System.out.println(index + " position element not found");
        }
        return list;
    }
}