import java.util.NoSuchElementException;

public class Queue<T> {
    private class Node{
        T data;
        Node next;
        Node(){
            this.next = null;
            this.data = null;
        }
        Node(T val){
            this.data=val;
            this.next=null;
        }
    }
    private Node front;
    private Node rear;
    private int size;
    Queue(){
        front = null;
        rear = null;
        size = 0;
    }
    void add(T val){
        if(front==null){
            front = new Node(val);
            rear = front;
        }
        else{
            rear.next = new Node(val);
            rear = rear.next;
        }
        size++;
    }
    T poll(){
        if(front!=null) {
            size--;
            Node temp = front;
            front = front.next;
            System.gc();
            return temp.data;
        }
        else
            throw new NoSuchElementException("Queue is empty!");
    }
    T getFront(){
        return front.data;
    }
    T getRear(){
        return rear.data;
    }
    int size(){
        return size;
    }
    //TODO : Iterator
}
