public class StackImpl {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    StackImpl() {
        top = -1;
    }

    boolean push(int elementToPush) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            // Increase value of top and pushed element in stack
            a[++top] = elementToPush;
            System.out.println(elementToPush + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popedElement = a[top--];
            return popedElement;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int peekedElement = a[top];
            return peekedElement;
        }
    }

    void printStack() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}
