package dataStructure;

public class BST {

    public  Node root;

    // Root of BST
    public class Node {
        public int value;
        public Node left;
        public Node right;

        // Constructor
        public Node(int value) {
            this.value = value;
        }
    }

    // Constructor
    // Construtor
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(final Node root, final int value) {
        if (root == null) return;
        if (value == root.value) return;
        if (value > root.value) {
            if (root.right == null) {
                root.right = new Node(value);
            } else insert(root.right, value);
        } else {
            if (root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(final Node node) {
        // E R D
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(final Node root, final int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    // This method mainly calls deleteNode with root
    // Método para deletar um nó
    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    // A recursive function to insert a new key in BST
    // Função para inserir um novo nó na BST
    private Node deleteNode(final Node root, final int value) {
        if (root == null) return null;

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if ((root.left == null) && (root.right == null)) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
            }
        }
    return root;
    }


    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(25);
        tree.insert(68);
        tree.insert(3);
        tree.insert(6);
        tree.insert(42);
        tree.insert(312);
        tree.insert(78);


        tree.deleteNode(68);
        tree.inOrder();
    }
}
