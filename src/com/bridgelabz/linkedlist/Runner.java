package com.bridgelabz.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> list = new <Integer>LinkedList();
        list.addElement(70);
        list.addElement(36);
        list.addElement(50);
        list.showList();

        LinkedList<Integer> list1 = new <Integer>LinkedList();
        list1.appendElement(56);
        list1.appendElement(30);
        list1.appendElement(70);
        list1.showList();

        LinkedList<Integer> list2 = new <Integer>LinkedList();
        list2.appendElement(56);
        list2.insertAtPos(30,1);
        list2.appendElement(70);
        list2.showList();

    }
}
