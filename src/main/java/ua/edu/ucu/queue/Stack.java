package ua.edu.ucu.queue;

public class Stack {

    private ImmutableLinkedList array;

    public Stack(Object e) {

        array = new ImmutableLinkedList(e);
    }

    public Stack() {

        array = new ImmutableLinkedList();
    }

    public Object pop() {

        Object elem = array.getLast();
        array = array.removeLast();

        return elem;
    }

    public Object peek() {

        return array.getLast();
    }

    public String toString() {

        return array.toString();
    }

    public void push(Object e) {

        array = array.addLast(e);
    }

    public Object[] toArray() {

        return array.toArray();
    }
}
