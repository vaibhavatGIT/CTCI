
import java.util.*;

class Reverse {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public void push(int key) {
        Node newNode = new Node(key);
        newNode.next = head;
        head = newNode;
    }

    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public Node inplaceRev() {
        Node prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public void printReverse() {
        Node temp = head;
        Stack<Node> stack = new Stack<Node>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        while (stack.size() > 0) {
            System.out.print(stack.peek().data + " ");
            stack.pop();
        }

    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.push(1);
        r.push(2);
        r.push(3);
        r.push(4);
        r.push(5);
        r.printNode();
        // r.inplaceRev();
        r.printReverse();
        // r.printNode();

    }

}