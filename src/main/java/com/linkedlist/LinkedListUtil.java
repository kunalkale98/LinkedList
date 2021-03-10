package com.linkedlist;

public class LinkedListUtil {

    public Node head = null;
    public Node tail = null;

    public void toAppend(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void toInsertInFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            head = newNode;
            head.next = tempNode;
        }
    }

    public void toInsertInBetween(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node temp = head.next;
            head.next = newNode;
            newNode.next = temp;
        }
    }

    public void pop(){
        Node temp = head;
        head = head.next;
        System.out.println("Removed "+temp.key);
    }

    public void popLast(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        temp = temp.next;
        System.out.println("Removed "+temp.key);
    }

    public void toPrint(){
        int count = 1;
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while( current != tail.next ){
                System.out.println("Node "+count);
                count++;
                System.out.println(current.key+" ");
                current = current.next;
            }
        }
    }

    public static void main(String args[]){
        LinkedListUtil lList = new LinkedListUtil();
        lList.toInsertInFront(56);
        lList.toAppend(70);
        lList.toInsertInBetween(30);
        lList.toPrint();
        lList.popLast();
        lList.toPrint();
    }
}
