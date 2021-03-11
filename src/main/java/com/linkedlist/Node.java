package com.linkedlist;

public class Node<T> {

    public T key;
    public Node next;

    public Node(T key){
        this.key = key;
        this.next = null;
    }
}
