class DeletingNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // check if first node is to be deleted
        if (temp != null && temp.data == key) {
            temp.next = head;
            return;
        }

        // check for node to be deleted is in between
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // if key was not present
        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public static void main(String[] args) {
        DeletingNode dd = new DeletingNode();
        dd.push(5);
        dd.push(0);
        dd.push(7);

        dd.printList();
        dd.deleteNode(5);
        dd.printList();

    }

}