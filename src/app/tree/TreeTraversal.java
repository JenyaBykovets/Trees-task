package app.tree;
import app.data.Node;

import java.util.ArrayList;
import java.util.List;

    public class TreeTraversal {
        public List<Integer> inorderResult = new ArrayList<>();
        public List<Integer> preorderResult = new ArrayList<>();
        public List<Integer> postorderResult = new ArrayList<>();

        public void inorderTraversal(Node node) {
            if (node != null) {
                inorderTraversal(node.left);
                inorderResult.add(node.value);
                inorderTraversal(node.right);
            }
        }

        public void preorderTraversal(Node node) {
            if (node != null) {
                preorderResult.add(node.value);
                preorderTraversal(node.left);
                preorderTraversal(node.right);
            }
        }

        public void postorderTraversal(Node node) {
            if (node != null) {
                postorderTraversal(node.left);
                postorderTraversal(node.right);
                postorderResult.add(node.value);
            }
        }
    }

