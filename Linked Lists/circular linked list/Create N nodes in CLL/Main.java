import java.util.Scanner;

public class Main {

    // Node class
    static class Node {
        int Data;
        Node Next;

        Node(int val) {
            Data = val;
            Next = null;
        }
    }

    // getNode
    static Node getNode(int val) {
        return new Node(val);
    }

    // Create Circular Linked List
    static Node Create_CLL(int n) {

        if (n <= 0) {
            return null;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for node 1: ");
        int x = sc.nextInt();

        Node start = getNode(x);
        start.Next = start;    // 🔁 circular link
        Node Last = start;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter value for node " + i + ": ");
            x = sc.nextInt();

            Last.Next = getNode(x);
            Last = Last.Next;
            Last.Next = start;
        }
   System.out.println(" Data OF Last.Next Node :"+Last.Next.Data);
        return start;
    }

    // Display CLL
    static void Display_CLL(Node start) {

        if (start == null) {
            System.out.println("CLL is empty");
            return;
        }

        Node temp = start;
        do {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        } while (temp != start);

        System.out.println();
    }

    // main
    public static void main(String[] args) {

        Node head = Create_CLL(3);
        Display_CLL(head);

    }
}
