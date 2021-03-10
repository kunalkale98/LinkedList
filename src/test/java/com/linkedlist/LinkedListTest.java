package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given_Data_InSearchMethod_Should_Return_Data() {
        LinkedListUtil lList = new LinkedListUtil();
        lList.toAppend(56);
        lList.toAppend(30);
        lList.toAppend(70);
        lList.toPrint();
        int output = lList.toSearch(30);
        Assert.assertEquals(30,output);
    }
}
