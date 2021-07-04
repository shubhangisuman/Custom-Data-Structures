import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class Stack<T> implements Iterable<T>{
    class Node{
        T data;
        Node next;
        Node(){
            this.data = null;
            this.next = null;
        }
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    class StackIterator implements Iterator<T>{
        Node cur;
        StackIterator(){
            cur = top;
        }
        public boolean hasNext() {
            return cur != null;
        }
        public T next() {
            Node temp = cur;
            cur = cur.next;
            return temp.data;
        }
        public void remove() {
        }
    }
    private Node top;
    private int size;
    //    private LinkedList<T> list;
    Stack(){
        this.top=null;
        this.size=0;
    }
    void push(T val){
        if(this.top==null){
            this.top = new Node(val);
        }
        else{
            Node temp = new Node(val);
            temp.next = top;
            top = temp;
        }
        size++;
    }
    T pop(){
        if(top!=null) {
            Node cur = top;
            top = top.next;
            size--;
            return cur.data;
        }
        else
            throw new EmptyStackException();
    }
    T peek(){
        return top.data;
    }
    int size(){
//        int size=0;
//        Node ptr = top;
//        while(ptr.next!=null){
//            size++;
//            ptr=ptr.next;
//        }
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top.data +
                ", size=" + size +
                '}';
    }
    public Iterator<T> iterator() { //returns an iterator object
        return new StackIterator();
    }
}
