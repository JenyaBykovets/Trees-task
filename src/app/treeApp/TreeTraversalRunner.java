package app.treeApp;
import app.data.BinaryTree;
import app.tree.TreeTraversal;

public class TreeTraversalRunner {
    public void runTreeTraversal() {
        BinaryTree binaryTree = new BinaryTree();


        binaryTree.addNode(8);
        binaryTree.addNode(3);
        binaryTree.addNode(10);
        binaryTree.addNode(1);
        binaryTree.addNode(6);
        binaryTree.addNode(14);
        binaryTree.addNode(4);
        binaryTree.addNode(7);
        binaryTree.addNode(13);
        binaryTree.addNode(12);
        binaryTree.addNode(11);
        binaryTree.addNode(9);

        TreeTraversal treeTraversal = new TreeTraversal();


        treeTraversal.inorderTraversal(binaryTree.root);
        System.out.println("Inorder traversal: " + treeTraversal.inorderResult);

        treeTraversal.preorderTraversal(binaryTree.root);
        System.out.println("Preorder traversal: " + treeTraversal.preorderResult);

        treeTraversal.postorderTraversal(binaryTree.root);
        System.out.println("Postorder traversal: " + treeTraversal.postorderResult);
    }
}


