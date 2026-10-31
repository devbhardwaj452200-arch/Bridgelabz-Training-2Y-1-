package LinkedList.Basic;
public class BasicLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Trick 1");

        System.out.print(a.data + " -> ");
        System.out.print(a.next.data + " -> ");
        System.out.print(a.next.next.data + " -> ");
        System.out.print(a.next.next.next.data + " -> ");
        System.out.println(a.next.next.next.next.data);

        System.out.println("Trick 2");

        Node temp = a;

        for (int i = 0; i < 5; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");

        System.out.println("Trick 3");

        Node temp2 = a;

        while (temp2 != null) {
            System.out.print(temp2.data + " -> ");
            temp2 = temp2.next;
        }

        System.out.println("null");
    }
}
