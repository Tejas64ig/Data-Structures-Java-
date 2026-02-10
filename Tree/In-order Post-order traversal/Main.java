public class Main {

  
    static class Node {
        int Data;
        Node Lchild;
        Node Rchild;

        Node(int val) {
            Data = val;
            Lchild = null;
            Rchild = null;
        }
    }

    // Inorder Traversal 
    static void Inorder(Node root) {
        if (root != null) {
            Inorder(root.Lchild);
            System.out.print(root.Data + " ");
            Inorder(root.Rchild);
        }
    }

    // Preorder Traversal 
    static void Preorder(Node root) {
        if (root != null) {
            System.out.print(root.Data + " ");
            Preorder(root.Lchild);
            Preorder(root.Rchild);
        }
    }

    // Postorder Traversal 
    static void Postorder(Node root) {
        if (root != null) {
            Postorder(root.Lchild);
            Postorder(root.Rchild);
            System.out.print(root.Data + " ");
        }
    }

    public static void main(String[] args) {

       
        Node root = new Node(10);
        root.Lchild = new Node(20);
        root.Rchild = new Node(30);
        root.Lchild.Lchild = new Node(40);
        root.Lchild.Rchild = new Node(50);

        System.out.println("Inorder Traversal:");
        Inorder(root);

        System.out.println("\nPreorder Traversal:");
        Preorder(root);

        System.out.println("\nPostorder Traversal:");
        Postorder(root);
    }
}
