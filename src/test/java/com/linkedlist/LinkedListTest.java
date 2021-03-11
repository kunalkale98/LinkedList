package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void givenData_InSearchMethod_ShouldReturnData() {
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
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
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
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
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(40);
        Node fourthNode = new Node(70);
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
}
