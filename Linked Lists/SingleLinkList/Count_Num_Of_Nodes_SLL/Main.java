public class Main{

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

        static int Count_Nodes(Node start) {
             int Count = 0;

            if(start==null){
                return Count;
            }
      while(start!=null){
          Count++;
          start = start.Next;
      }
      return Count;
            }


        }

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

        public static void main(String[] args) {
            Node head = null;
            head = Node.getNode(10);
            head.Next = Node.getNode(20);
            head.Next.Next = Node.getNode(30);
            Display(head);
            int count =Node.Count_Nodes(head);

System.out.println("\nCount is "+count);
        }
    }
