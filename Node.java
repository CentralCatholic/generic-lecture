public class Node<T> {

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public String toString() {
        return "Node: " + this.data.toString();
    }
}
