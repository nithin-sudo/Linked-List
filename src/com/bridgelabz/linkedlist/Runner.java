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

        LinkedList<Integer> list3 = new <Integer>LinkedList();
        list3.appendElement(56);
        list3.insertAtPos(30,1);
        list3.appendElement(70);
        list3.deleteAtFirst();
        list3.showList();

        LinkedList<Integer> list4 = new <Integer>LinkedList();
        list4.appendElement(56);
        list4.insertAtPos(30,1);
        list4.appendElement(70);
        list4.deleteAtLast();
        list4.showList();

        LinkedList<Integer> list5 = new <Integer>LinkedList();
        list5.appendElement(56);
        list5.insertAtPos(30,1);
        list5.appendElement(70);
        list5.showList();
        list5.searchElement(30);

        LinkedList<Integer> list6 = new <Integer>LinkedList();
        list6.appendElement(56);
        list6.appendElement(30);
        list6.appendElement(70);
        list6.insertAtPos(40,2);
        list6.showList();

        LinkedList<Integer> list7 = new <Integer>LinkedList();
        list7.appendElement(56);
        list7.appendElement(30);
        list7.appendElement(70);
        list7.insertAtPos(40,2);
        list7.deleteFromPos(3);
        list7.showList();

        LinkedList<Integer> list8 = new <Integer>LinkedList();
        list8.appendElement(56);
        list8.appendElement(30);
        list8.appendElement(70);
        list8.insertAtPos(40,2);
        list8.sortList();
        list8.showList();
    }
}
