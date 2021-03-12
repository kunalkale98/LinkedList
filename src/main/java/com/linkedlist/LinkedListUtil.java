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

    public <T extends Comparable> Node<T> toSearch(T data){
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
            return current;
        }
    }

    public <T extends Comparable> Node<T> insertAfterSearch(T data, Node search){
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

    public <T extends Comparable> Node<T> deleteNode(T data){
        if(this.head == null){
            System.out.println("List is empty");
            return this.head;
        }
        else {
            Node current = this.head;
            while (current.next.key != data) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = current.next.next;
            System.out.println("Removed " +temp.key);
            return temp;
        }
    }

    public void toPrint(){
        int count = 1;
        Node current = this.head;

        if(this.head == null){
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

    public void orderedList(Node newNode){
        if (this.head == null || this.head.key.compareTo(newNode.key) >= 0) {
            newNode.next = this.head;
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            Node current = this.head;
            while (current.next != null && current.next.key.compareTo(newNode.key) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void size(){
        Node current = this.head;
        int count = 0;
        while (current != this.tail.next){
            current = current.next;
            count ++;
        }
        System.out.println("Size of list is "+count);
    }
}
