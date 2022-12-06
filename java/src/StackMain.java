public class StackMain {
    public static void main(String[] args) {
        StackImpl myStack = new StackImpl();
        myStack.push(10);
        myStack.push(11);
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);

        System.out.println(myStack.pop() + " Popped from Stack");
        System.out.println("Top element is " + myStack.peek());
        System.out.println("Printing remaining Stack");

        myStack.printStack();
    }
}
