package lab1;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(list, 1);
        list.addNode(list, 3);
        list.addNode(list, 5);
    }

    Node head;
    Node tail;

    //displaying linked list values
    public void displayValues(LinkedList b) {
        Node current = b.head;

        System.out.print("LinkedList values are : ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    //method to insert data at specific position
    public void insertData(LinkedList c, int pos, int value) {

        Node d = new Node(value);
        Node current = head;

        //if head is empty
        if (pos < 1) {
            System.out.println("enter valid entry ");
        }

        if (pos == 1) {
            c.head = d;
        }

        if (pos > 1) {
// Insert a new node at last node
            for (int i = 0; i < pos; i++) {
                current = head.next;
            }
        }
        current = d; //reassinging 
    }

    //method to add node
    public void addNode(LinkedList a, int data) {

        Node newNode = new Node(data);
        newNode.next = null;

        //if the list is empty
        if (a.head == null) {
            a.head = newNode;
        } else {
            tail = a.head;
            while (tail.next != null) {
                tail = tail.next;
            }

            // Insert the new_node at last node
            tail.next = newNode;
        }
    }

    //delete specific node
    public void deleteNode(LinkedList e, int position) {

        Node current = e.head;
        Node previous = null;

        //wrong position value
        if (position < 1) {
            System.out.println("enter valid entry ");
        }

        //position = head
        if (position == 1) {
            e.head = current.next; // Changed head
        }

        if (position > 1) {
            for (int i = 0; i < position; i++) {
                current = head.next;
            }
            current = current.next;
        }
    }

    //Modifying data in a node of a linked list
    public void editNode(int val, int pos) {
        Node newNode = new Node(val);
        Node prev = head;

        for (int count = 1; count < pos - 1; count++) {
            prev = prev.next;
        }

        Node current = prev.next;
        newNode.next = current;
        prev.next.data = val;
    }

    //Create Linked list Node Class
    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
