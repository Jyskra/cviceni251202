import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedListIteratorBackwards implements Iterator<Node> {
    private Node current;
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        if (!hasNext()){
            throw new NoSuchElementException("UFJ");
        }
        Node temp = current;
        current = current.getPrev();
        return temp;
    }

    public MyLinkedListIteratorBackwards(Node current) {
        this.current = current;
    }
}
