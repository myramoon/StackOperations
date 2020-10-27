package com.stackoperations;

public class MyStack {

    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {  //method to add elemets to stack
        myLinkedList.add(myNode);
    }

    public INode peek() {       // method to return topmost element in stack
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }

    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }
}
