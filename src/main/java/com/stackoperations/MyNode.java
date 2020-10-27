/* Purpose: to create a linked list and insert a node between 2 existing nodes */
package com.stackoperations;

public class MyNode<E> implements INode<E> {
    public E key;
    public INode next;

    public MyNode(E key) {
        this.key = key;
        this.next = null;
    }
    //implementation of methods from INode interface
    @Override
    public E getKey() {
        return key;
    }

    @Override
    public void setKey(E key) {
        this.key = key;
    }

    //getter and setter methods for next
    public INode getNext() {
        return next;
    }
    public void setNext(INode next) {
        this.next = next;
    }
}
