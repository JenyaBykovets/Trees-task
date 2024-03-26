package app.data;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            addNodeRecursive(root, newNode);
        }
    }

    private void addNodeRecursive(Node currentNode, Node newNode) {
        if (newNode.value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                addNodeRecursive(currentNode.left, newNode);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                addNodeRecursive(currentNode.right, newNode);
            }
        }
    }
}


