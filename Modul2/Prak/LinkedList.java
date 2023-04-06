package Modul2.Prak;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { /* LinkedList kosong. */
            head = newNode;
        } else if (data < head.data) { /* Data baru akan menjadi head. */
            newNode.next = head;
            head = newNode;
        } else { /* Cari posisi yang tepat untuk node baru. */
            Node current = head;
            while (current.next != null && data > current.next.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(8);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("\nBefore : 8 7 1 4 6 2 3");
        System.out.print("After : ");
        linkedList.printList(); /* Output: 1 2 3 4 6 7 8 */
        System.out.println("\nSUCCESS\n");
    }
}