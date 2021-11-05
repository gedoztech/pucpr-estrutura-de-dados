package LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // Init empty list
        List list = new List();

        // Insert numbers at the end of the list
        list.insertLast(list, 50);
        list.insertLast(list, 20);
        list.insertLast(list, 30);

        // Should display: 50, 20, 30
        list.display();

        // Insert number at the beginning of the list
        list.insertFirst(list, 12);

        // Should display: 12, 50, 20, 30
        list.display();

        // Get second node of the list
        Node n2 = list.getHead().getNext();

        // Insert number after list second node
        list.insertAfter(n2, 400);

        // Should display: 12, 50, 400, 20, 30
        list.display();

        // Remove list first node
        list.removeFirst(list);

        // Should display: 50, 400, 20, 30
        list.display();

        // Remove list last node
        list.removeLast(list);

        // Should display: 50, 400, 20
        list.display();

        // Get list third node
        Node nn3 = list.getHead().getNext().getNext();

        // Remove a node passed as a parameter from the list
        // Passed third node of list as parameter (remove list third node)
        list.remove(list, nn3);

        // Should display: 50, 400
        list.display();
    }
}
