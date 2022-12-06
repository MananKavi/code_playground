package lists;

public class SinglyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static SinglyLinkedList insert(SinglyLinkedList list, int data) {
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    public static void printList(SinglyLinkedList list) {
        Node currNode = list.head;

        System.out.println("Linked List: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {
        Node currentNode = list.head;
        Node prev = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;

            System.out.println("\n " + key + " found and deleted");

            return list;
        }

        while (currentNode != null && currentNode.data != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            prev.next = currentNode.next;

            System.out.println("\n " + key + " found and deleted");
        }

        if (currentNode == null) {
            System.out.println("\n " + key + " not found");
        }

        return list;
    }

    public static SinglyLinkedList deleteAtPosition(SinglyLinkedList list, int index) {
        Node currentNode = list.head;
        Node prev = null;

        if (index == 0 && currentNode != null) {
            list.head = currentNode.next;

            System.out.println("\n " + index + " position element deleted");

            return list;
        }

        int counter = 0;
        while (currentNode != null) {
            if (counter == index) {
                prev.next = currentNode.next;
                System.out.println("\n " + index + " position element deleted");

                break;
            } else {
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }

        if (currentNode == null) {
            System.out.println("\n " + index + " position element not found");
        }

        return list;
    }



    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        myList = insert(myList, 1);
        myList = insert(myList, 2);
        myList = insert(myList, 3);
        myList = insert(myList, 4);
        myList = insert(myList, 5);
        myList = insert(myList, 6);
        myList = insert(myList, 7);
        myList = insert(myList, 8);
        myList = insert(myList, 9);
        myList = insert(myList, 10);
        myList = insert(myList, 11);
        myList = insert(myList, 12);
        myList = insert(myList, 13);
        myList = insert(myList, 14);
        myList = insert(myList, 15);

        printList(myList);

        deleteByKey(myList, 1);

        printList(myList);

        deleteByKey(myList, 4);

        printList(myList);

        deleteByKey(myList, 10);

        printList(myList);

        deleteAtPosition(myList, 0);

        printList(myList);

        deleteAtPosition(myList, 2);

        printList(myList);

        deleteAtPosition(myList, 10);

        printList(myList);
    }
}
