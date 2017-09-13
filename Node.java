public class Node<T> {

    T data;

    public Node(T data) {
        this.data = data;
    }

    public String toString() {
        return "Node: " + this.data.toString();
    }
}
