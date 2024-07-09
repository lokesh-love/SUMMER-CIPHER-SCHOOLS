import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        // Creating nodes
        Node head = new Node(6);
        Node second = new Node(7);
        Node third = new Node(8);
        Node fourth = new Node(9);
        Node fifth = new Node(10);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        // Traversing and printing the linked list
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
