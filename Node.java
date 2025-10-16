// Java program to count number of nodes 
// in a circular linked list

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Function to count nodes in a given Circular
// linked list 
class GfG {

    static int countNodes(Node head) {
        if (head == null) return 0;

        Node curr = head;
        int result = 0;

        do {
            curr = curr.next;
            result++;
        } while (curr != head);

        return result;
    }

    public static void main(String[] args) {
        
        // Create list: 1->2->3->4->5--->1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head;

        System.out.println(countNodes(head));
    }
}
