package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void givenData_InSearchMethod_ShouldReturnData() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(70);
        LinkedListUtil lList = new LinkedListUtil();
        lList.toAppend(firstNode);
        lList.toAppend(secondNode);
        lList.toAppend(thirdNode);
        lList.toPrint();
        Node output = lList.toSearch(30);
        Assert.assertEquals(30,output.key);
    }

    @Test
    public void givenData_ToInsertAfterSearch_ShouldReturnSequence() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(70);
        LinkedListUtil lList = new LinkedListUtil();
        lList.toAppend(firstNode);
        lList.toAppend(secondNode);
        lList.toAppend(thirdNode);
        //lList.toPrint();
        Node output = lList.toSearch(30);
        Node newNode = lList.insertAfterSearch(40,output);
        //lList.toPrint();
        boolean result = lList.head.equals(firstNode) && firstNode.next.equals(secondNode)
                && secondNode.next.equals(newNode) && newNode.next.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenData_ToDeleteMethod_ShouldRemoveData() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(40);
        Node<Integer> fourthNode = new Node(70);
        LinkedListUtil lList = new LinkedListUtil();
        lList.toAppend(firstNode);
        lList.toAppend(secondNode);
        lList.toAppend(thirdNode);
        lList.toAppend(fourthNode);
        lList.toPrint();
        Node removed = lList.deleteNode(40);
        Assert.assertEquals(40,removed.key);
        lList.size();
    }

    @Test
    public void givenData_ToSortMethod_ShouldReturnOrderedList() {
        Node<Integer> firstNode = new Node(56);
        Node<Integer> secondNode = new Node(30);
        Node<Integer> thirdNode = new Node(40);
        Node<Integer> fourthNode = new Node(70);
        LinkedListUtil lList = new LinkedListUtil();
        lList.orderedList(firstNode);
        lList.orderedList(secondNode);
        lList.orderedList(thirdNode);
        lList.orderedList(fourthNode);
        boolean result = lList.head.equals(secondNode) && secondNode.next.equals(thirdNode)
                && thirdNode.next.equals(firstNode) && firstNode.next.equals(fourthNode);
        Assert.assertTrue(result);
        lList.toPrint();
    }
}
