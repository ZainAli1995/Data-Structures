package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,5);
        list.insert(list,10);

        list.printList(list);

        list.removeByKey(list,4);
        list.removeByKey(list, 5);

        list.printList(list);

        list.deleteAtPosition(list,2);
        list.printList(list);
    }
}