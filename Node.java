package List;

public class Node <T extends Comparable<? super T>>{
    private T key;
    private Node<T> next;

    public Node(T key, Node<T> next) {
        this.key = key;
        this.next = null;
    }

    public Node() {}

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
   
    
}
