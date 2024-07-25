package components;

class BSTNode {
    int data;
    BSTNode right;
    BSTNode left;

    public BSTNode(int data) {
        this.data = data;
        right = left = null;
    }
}

public class BinarySearchTree {
    BSTNode root = null;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private BSTNode insertRec(BSTNode root, int data) {
        if (root == null) {
            root = new BSTNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inorderRec(root);
    }

    private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data + " ");
            inorderRec(root.right);
        }
    }
}
