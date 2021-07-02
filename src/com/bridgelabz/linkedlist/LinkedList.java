package com.bridgelabz.linkedlist;

public class LinkedList<T extends Comparable> {
    Node <T>head;
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
    public <T extends Comparable>void insertAtPos(T data,int position) {
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
     * deleting the last element in the linked list.
     */
    public void deleteAtLast()
    {
        Node tempNode = new Node();
        Node prevNode = new Node();
        tempNode = head;
        while(tempNode.next!=null)
        {
            prevNode=tempNode;
            tempNode=tempNode.next;
        }
        prevNode.next=null;
    }
    /**
     * searching the element in the linked list.
     * @param data
     * @param <T>
     */
    public <T extends Comparable>void searchElement(T data)
    {
        Node tempNode = new Node();
        tempNode = head;
        int position = 0;
        while (tempNode.data != data) {
            tempNode = tempNode.next;
            position++;
        }
        System.out.println("element "+data+" found at position :"+position);
    }
    /**
     * deleting element at any position.
     * @param position
     */
    public void deleteFromPos(int position)
    {
        Node tempNode;
        Node nextNode;
        tempNode = head;
        int i =1;
        while (i < position-1)
        {
            tempNode=tempNode.next;
            i++;
        }
        nextNode=tempNode.next;
        tempNode.next=nextNode.next;
    }
    /**
     * sorting the linked list using bubble sort.
     * @param <T>
     */
    public <T extends Comparable>void sortList()
    {
        Node tempNode ;
        Node nextNode ;
        T temp = null;
        tempNode = head;
        System.out.println("after sorting the list:");
        while(tempNode.next!=null)
        {
            nextNode=tempNode.next;
            while (nextNode.next!=null)
            {
                if(tempNode.data.compareTo(nextNode.data)>0){
                    temp = (T) tempNode.data;
                    tempNode.data = nextNode.data;
                    nextNode.data = temp;

                }
                nextNode=nextNode.next;
            }
            tempNode=tempNode.next;
        }
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
