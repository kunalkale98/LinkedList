package com.linkedlist;

public class LinkedListUtil {

    public Node head = null;
    public Node tail = null;
    private static int count = 1;

    public void addNode(int data) {
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
        lList.addNode(56);
        lList.addNode(30);
        lList.addNode(70);
        lList.toPrint();
    }
}
