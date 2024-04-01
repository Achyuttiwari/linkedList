package main;
import node.Node;
import node.NodeOperation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node[] head = new Node[1];
        NodeOperation temp = new NodeOperation();
        for (int i = 5; i > 0; i--) {
            temp.pushNode(head, i);
        }
        ArrayList<Integer> v = new ArrayList<Integer>();
        Node curr = head[0];
        while (curr != null) {
            v.add(curr.data);
            curr = curr.next;


        }

        System.out.print("Middle Value Of Linked List is : ");
        System.out.println(v.get(v.size() / 2));
    }
}