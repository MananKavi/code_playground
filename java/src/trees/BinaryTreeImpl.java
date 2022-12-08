package trees;

public class BinaryTreeImpl {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private BinaryTreeImpl createBinaryTree() {
        BinaryTreeImpl myTree = new BinaryTreeImpl();

        myTree.add(8);
        myTree.add(7);
        myTree.add(6);

        return myTree;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.left, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public static void main(String[] args) {
        BinaryTreeImpl myPersonalTree = new BinaryTreeImpl();

        myPersonalTree.add(3);
        myPersonalTree.add(5);
        myPersonalTree.add(55);
        myPersonalTree.add(6);
        myPersonalTree.add(11);
        myPersonalTree.add(9);
        myPersonalTree.add(38);
        myPersonalTree.add(2);
        myPersonalTree.add(7);
        myPersonalTree.add(44);

        System.out.println("\n Inorder traversal");
        myPersonalTree.traverseInOrder(myPersonalTree.root);
        System.out.println("\n");

        System.out.println("\n Preorder traversal");
        myPersonalTree.traversePreOrder(myPersonalTree.root);
        System.out.println("\n");

        System.out.println("\n Postorder traversal");
        myPersonalTree.traversePostOrder(myPersonalTree.root);
        System.out.println("\n");

        myPersonalTree.delete(5);
        myPersonalTree.delete(7);
        myPersonalTree.delete(9);

        System.out.println("\n Inorder traversal");
        myPersonalTree.traverseInOrder(myPersonalTree.root);
        System.out.println("\n");
    }
}
