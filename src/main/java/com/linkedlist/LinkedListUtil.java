package com.linkedlist;

public class LinkedListUtil {

    public Node head = null;
    public Node tail = null;
    private static int count = 1;

    public void toInsertInFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node tempNode = head;
            head = newNode;
            head.next = tempNode;
        }
    }

    public void toPrint(){
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while( current != null ){
                System.out.println("Node "+count);
                count++;
                System.out.println(current.key+" ");
                current = current.next;
            }
        }
    }

    public static void main(String args[]){
        LinkedListUtil lList = new LinkedListUtil();
        lList.toInsertInFront(70);
        lList.toInsertInFront(30);
        lList.toInsertInFront(56);
        lList.toPrint();
    }
}
