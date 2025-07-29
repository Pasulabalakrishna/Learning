package org.example.LinkedList;

public class LoopLinkedList<T> {

    Node<T> head;

    public Node<T> isLoop() {

        //Tortoise and hare technique or Floyd's cycle detection
        if(head==null){
            System.out.println("Head is null");
            return null;
        }
        Node<T> slow=head;
        Node<T> fast=head.next.next;
        while(fast!=null && fast.next!=null){
            if(slow ==fast){
                System.out.println("Yes its loop");
                return fast;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("No loop found");
        return null;
    }
    public Node<T> middleOfLoop(){

        Node<T> temp=isLoop();
        int length=lengthOfLoop();
        for(int i=1;i<length/2;i++){
            temp=temp.next;
        }
        return temp;


    }
    public int lengthOfLoop(){
        Node<T> temp=isLoop();
        Node<T> fast=temp;
        int count=0;
        if(fast==fast.next){
            return ++count;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            if(fast==temp){
                break;
            }
            count++;
        }
        return count;
    }
}
