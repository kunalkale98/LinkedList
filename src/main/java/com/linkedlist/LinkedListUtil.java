package com.linkedlist;

public class LinkedListUtil {

    public Node head;
    public Node tail;

    public LinkedListUtil(){
        this.head = null;
        this.tail = null;
    }

    public void toAppend(Node newNode){
        if(this.head == null && this.tail == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void toInsertInFront(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node tempNode = this.head;
            this.head = newNode;
            this.head.next = tempNode;
        }
    }

    public void toInsertInBetween(Node newNode){
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            Node temp = this.head.next;
            this.head.next = newNode;
            newNode.next = temp;
        }
    }

    public Node toSearch(int data){
        if(this.head == null){
            System.out.println("List is empty");
            return this.head;
        }
        else {
            Node current = this.head;
            int count = 1;
            while (current.key != data) {
                current = current.next;
                count++;
            }
            System.out.println(current.key + " is at node " + count);
            return current;
        }
    }

    public Node insertAfterSearch(int data,Node search){
        Node newNode = new Node(data);
        Node current =  search;
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
        return current.next;
    }

    public void pop(){
        if(this.head == null){
            System.out.println("List is empty");
        }
        else {
            Node temp = this.head;
            this.head = this.head.next;
            System.out.println("Removed " + temp.key);
        }
    }

    public void popLast(){
        if(this.head == null){
            System.out.println("List is empty");
        }
        else {
            Node temp = this.head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            this.tail = temp;
            temp = temp.next;
            System.out.println("Removed " + temp.key);
        }
    }

    public void toPrint(){
        int count = 1;
        Node current = this.head;

        if(this.head == null){
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
}
