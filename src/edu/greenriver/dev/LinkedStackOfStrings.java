package edu.greenriver.dev;

public class LinkedStackOfStrings {
    // helper class
    private class Node {
        String item;
        Node next;
    }

    // fields???
    private Node first;
    private int n;          // counter

    // methods
    public LinkedStackOfStrings() {
        first = null;
        n = 0;
    }

    public void push(String item) {
        // the diagram was from the slide
        // code is also in the book - make sure you understand
        // every line of this method and why we do all 4 lines
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public String pop() {
        if (!isEmpty()) {
            String item = first.item;
            first = first.next;
            n--;
            return item;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;   // change this later
    }


}
