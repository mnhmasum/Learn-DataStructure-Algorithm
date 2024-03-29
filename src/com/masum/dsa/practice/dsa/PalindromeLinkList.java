package com.masum.dsa.practice.dsa;

import java.util.Stack;

/**
 *
 * @author Masum
 */
public class PalindromeLinkList {

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        head.next = node2;

        Node node3 = new Node();
        node3.data = 1;
        node2.next = node3;

        Node auxHead = head;

        Stack<Integer> queue = new Stack();
        while (auxHead != null) {
            queue.add(auxHead.data);
            auxHead = auxHead.next;
        }

        while (head != null) {
            System.out.println(head.data);
            if (head.data != queue.pop()) {
                System.out.println("false");
                break;
            }

            head = head.next;
        }

    }
}
