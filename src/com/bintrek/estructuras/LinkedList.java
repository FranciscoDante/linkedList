/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bintrek.estructuras;

/**
 *
 * @author eldantek
 * @param <Item>
 */
public class LinkedList<Item> {

    Node first;
    int size;

    public void insert(Item newItem) {
        Node oldFirst = first;
        Node newNode = new Node();

        newNode.data = newItem;
        newNode.next = oldFirst;
        first = newNode;
        size++;
    }

    public Item get() {
        Item value = first.data;
        first = first.next;

        size--;

        return value;
    }

    public Item delete(int numNode) {
        if (numNode > 0 && numNode <= size) {
            Node current = first;
            Node prev = null;

            for (int i = 1; i <= size; i++) {
                if (i == numNode) {
                    if (prev == null) {
                        first = first.next;
                        size--;
                        return first.data;
                    } else {
                        prev.next = current.next;
                        size--;
                        return current.data;
                    }
                } else {
                    prev = current;
                    current = current.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    private class Node {

        Item data;
        Node next;
    }

}
