package h2;

public class SimpleList {
    public Node head;

    public SimpleList() {
        this.head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst() {
        return head.next; // null if there are no elements
    }

    public Node getLast() {
        Node current = getFirst();
        while (current != null && current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void append(int newValue) {
        Node current = getLast();
        if (current == null) {
            current = head;
        }
        current.next = new Node(newValue);
    }

    public Node findFirst(int value) {
        Node current = getFirst();
        while (current != null) {
            if (current.value == value) return current;
            current = current.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node current = findFirst(preValue);
        if (current == null) return false;
        Node temp = current.next;
        Node newNode = new Node(newValue);
        current.next = newNode;
        newNode.next = temp;
        return true;
    }

    public boolean delete(int value) {
        Node current = findFirst(value);
        if (current == null) return false;
        Node iterate = head;
        while (iterate != null) {
            if (iterate.next != current) {
                iterate = iterate.next;
                continue;
            }
            iterate.next = current.next;
            return true;
        }
        return false;
    }

}
