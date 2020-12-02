package ua.edu.ucu.queue;

public interface ImmutableList {

    ImmutableList add(Object e);

    ImmutableList addAll(Object[] c);

    ImmutableList add(int index, Object e);

    ImmutableList addAll(int index, Object[] c);

    ImmutableList remove(int index);

    Object get(int index);

    int indexOf(Object e);

    ImmutableList set(int index, Object e);

    ImmutableList clear();

    int size();

    boolean isEmpty();

    @Override
    String toString();

    Object[] toArray();
}
