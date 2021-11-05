package LinkedList;

public class List {

    private Node head;

    public List() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty(List list) {
        return list.head == null;
    }

    public void insertFirst(List list, int data) {

        Node node = new Node(data);

        if (isEmpty(list)) {
            list.head = node;
        } else {
            Node old = list.head;
            list.head = node;
            list.head.setNext(old);
        }
    }

    public void insertLast(List list, int data)
    {
        Node node = new Node(data);

        if (isEmpty(list)) {
            list.head = node;
        } else {
            Node last = list.head;
            while (last.getNext() != null) {
                last = last.getNext();
            }

            last.setNext(node);
        }
    }

    public void insertAfter(Node previousNode, int dataToBeInserted)
    {
        if (previousNode == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(dataToBeInserted);
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    public void removeFirst(List list)
    {
        Node second = list.head.getNext();
        list.head.setNext(null);
        list.head = second;
    }

    public void removeLast(List list)
    {
        if (list.head == null || list.head.getNext() == null) {
            System.out.println("errr");
            return;
        }

        Node temp = list.head;
        while(temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    public void remove(List list, Node nodeToBeDeleted)
    {
        Node node = list.head;
        while (node.getNext() != null) {
            Node prev = node;
            Node next = node.getNext().getNext();

            node = node.getNext();

            if (node == nodeToBeDeleted) {
                prev.setNext(next);
            }
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData());
            if (node.getNext() != null) {
                System.out.print(", ");
            }
            node = node.getNext();
        }
        System.out.println("");
    }
}
