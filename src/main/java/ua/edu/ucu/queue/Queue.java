package ua.edu.ucu.queue;

public class Queue {

    private ImmutableLinkedList array;

    public Queue(Object e) {

        array = new ImmutableLinkedList(e);
    }

    public Queue() {

        array = new ImmutableLinkedList();
    }

    public Object dequeue() {

        Object elem = array.getFirst();
        array = array.removeFirst();

        return elem;
    }

    public Object peek() {

        return array.getFirst();
    }

    public void enqueue(Object e) {

        array = array.addLast(e);
    }

    public Object[] toArray() {

        return array.toArray();
    }

    @Override
    public String toString() {

        return array.toString();
    }
}
