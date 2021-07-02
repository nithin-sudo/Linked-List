package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node head;
    /**
     * adding elements at the back of each node.
     *
     * @param data
     * @param <T>
     */
    public <T extends Comparable> void addElement(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.next = head;
        head = newNode;
    }
    /**
     * appending the element in the list.
     * @param data
     * @param <T>
     */
    public <T extends Comparable>void appendElement(T data)
    {
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head == null)
        {
            head=newNode;
        }
        else
        {
            Node tempNode;
            tempNode = head;
            while(tempNode.next!=null)
            {
                tempNode=tempNode.next;
            }
            tempNode.next=newNode;
        }
    }
    /**
     * inseriting elements at desired position.
     * @param data
     * @param position
     * @param <T>
     */
    public <T>void insertAtPos(T data,int position) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node tempNode = new Node();
        tempNode = head;
        int i = 0;
        while (i < position-1) {
            tempNode = tempNode.next;
            i++;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }
    /**
     * deleting the first element in the list.
     */
    public void deleteAtFirst()
    {
        Node tempNode;
        tempNode =head;
        tempNode=tempNode.next;
        head=tempNode;
    }
    /**
     * printing the elements in the list.
     */
    public void showList() {
        Node tempNode;
        tempNode = head;
        System.out.println("the elements in the list is:");
        while (tempNode.next != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }
}
