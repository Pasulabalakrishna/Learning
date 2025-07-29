package org.example.LinkedList;

import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(110);
        list.display();
        System.out.println(list.search(20));
        list.removeAtIndex(4);
        list.display();
        list.reverse();
        list.display();

        //find loop
//        LoopLinkedList<Object> list1=new LoopLinkedList<>();
//        list1.isLoop();

    }
}
