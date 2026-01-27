public class Main {

    public static class Node {

        int Data;
        Node Next;

        Node(int val) {
            Data = val;
            Next = null;
        }

        static Node Head = null;

        static Node getNode(int val) {
            return new Node(val);
        }

        // Revere
        static Node Revere(Node start) {
            Node rev = null;
            Head = start;
            while (Head != null) {

                Head = start.Next;
                start.Next = rev;
                rev = start;
                start = Head;
            }

            return rev;
        }

    }

    //             Display
    static void Display(Node Head) {
        if (Head == null) {
            return;
        }

        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.Data + " ");
            temp = temp.Next;
        }
    }


    public static void main() {
        Node head = null;
        Node Rev_Head = null;

        head = Node.getNode(10);
        head.Next = Node.getNode(20);
        head.Next.Next = Node.getNode(30);

        Display(head);

        // reverse
System.out.println("\nReverse SLL");
        head = Node.Revere(head);

        Display(head);
    }
}



