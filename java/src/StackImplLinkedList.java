public class StackImplLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int elementPush) {
        StackNode newNode = new StackNode(elementPush);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(elementPush + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    public static void main(String[] args) {
        StackImplLinkedList myStack = new StackImplLinkedList();

        myStack.push(10);
        myStack.push(11);
        myStack.push(12);

        System.out.println(myStack.pop() + " popped from stack");
        System.out.println("Top element is " + myStack.peek());
    }
}
