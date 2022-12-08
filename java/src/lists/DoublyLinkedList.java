package lists;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.insertNode(1);
        myList.insertNode(2);
        myList.insertNode(3);
        myList.insertNode(4);
        myList.insertNode(5);
        myList.insertNode(6);
        myList.insertNode(7);
        myList.insertNode(8);
        myList.insertNode(9);
        myList.insertNode(10);

        myList.display();
    }
}
