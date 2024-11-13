package adts;

import interfaces.ListInterface;
import iterators.DoublyLinkedIterator;
import nodes.DLLNode;

import java.util.Iterator;

public class DoublyLinkedSortedList<E> implements ListInterface<E>, Iterable<E>{
    private DLLNode<E> head;  // Head of the doubly linked list
    private DLLNode<E> tail;  // Tail of the doubly linked list
    private int size;         // Number of elements in the list
    private boolean found;    // Flag to check if element was found
    private DLLNode<E> location;  // Node where the element was found

    @Override
    public void add(E element) {
        //code goes here
    }

    @Override
    public boolean remove(E element) {
        //code goes here
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        //code goes here
        return false;
    }

    // Retrieve an item by index
    public E get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return list.get(index);
    }

    // Retrieve an item by value
    public E get(E item) {
        int index = Collections.binarySearch(list, item);
        return (index >= 0) ? list.get(index) : null;
    }

    public String toString() {
        //code goes here
    }    

    protected void find(E target) {
        //code goes here
    }    

    public void setIterationType(/*Need arguement*/) {
        //code goes here
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedIterator<>(head, tail, iterationType);
    }

}
