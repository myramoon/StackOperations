package com.stackoperations;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);      //add elements to stack using linked list add method
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peek = myStack.peek();    //call to check the topmost element in stack
        Assert.assertEquals(myThirdNode , peek);
    }

    @Test
    public void given3NumbersInStackWhenPopped_ShouldMatchWithLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);      //add elements to stack using linked list add method
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = null;
        while (!myStack.isEmpty()) {
            pop = myStack.pop();
        }
        Assert.assertEquals(myFirstNode , pop);
    }
}
