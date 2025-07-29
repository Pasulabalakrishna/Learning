package org.example.LinkedList;

public interface ILinkedList<T> {
    void add(T data);
    boolean search(T data);
    void display();
   void removeAtIndex(int index);
    void removeByValue(T data);

    Node<T> reverse();

}
//


//1. Remove from list
//2. Find a loop in a list
//3. Find the middle of a loop in a list
//
//Array List and LinkedList when to use and when not use them
//HashMap -- Internally working of HashMap
//TreeMap
//        LinkedHashMap
//WeakHashMap
//HashSet  -- > Two sum problem leetcode
//Enumerator and iterator
