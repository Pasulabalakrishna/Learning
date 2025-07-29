package org.example.LinkedList;

import java.util.Stack;

public class LinkedList<T> implements ILinkedList<T>{

    private  Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T data) {
        Node<T> node=new Node<>();
        if(head==null){
            node.data=data;
            node.next=null;
            head=node;
            tail=node;

        }else{
            node.data=data;
            node.next=null;
            tail.next=node;
            tail=tail.next;
        }
    }

    @Override
    public boolean search(T data) {
        Node<T> temp=head;
        if(head!=null){
            while(temp.next!=null){
                if(temp.data==data){
                    return true;

                }
                temp=temp.next;
            }
        }
        return temp.data==data;
    }

    @Override
    public void display() {
      Node<T> temp=head;
        if(temp==null){
            System.out.println("Head is null");
            return;
        }
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp= temp.next;
            }
            System.out.println(temp.data);
    }

    @Override
    public void removeAtIndex(int index) {
        Node<T> temp=head.next;
        Node<T> previous=head;

        if(head==null){
            System.out.println("head is Null");
            return;
        }
        if(index==0){
            removeFirst();
        }
        if(head==tail){
            head=null;
            return;
        }
        int count=1;
        while (temp.next!=null){
            if(count==index){
                previous.next=temp.next;
                return;
            }
            count++;
            temp=temp.next;
            previous=previous.next;
        }
//        System.out.println(count);
        if(count ==index){
//            removeLast();   remove Last
            previous.next=null;
        }
    }

    private void removeLast() {

    }

    private void removeFirst() {
        Node<T> temp=head;
        head=head.next;
    }


    @Override
    public void removeByValue(T data) {

    }

    @Override
    public Node<T> reverse() {
        if(head==null){
           return null;
        }
        Node<T> temp=head;
        Stack stack=new Stack<>();
        while(temp.next!=null){
            stack.push(temp);
            temp=temp.next;
        }
        stack.push(temp);
        head= (Node<T>) stack.pop();
        temp=head;
        while(!stack.isEmpty()){
            temp.next= (Node) stack.pop();
            System.out.println(temp.data);
            temp=temp.next;
        }
        temp.next=null;
        System.out.println("dhbdi");
        return temp;
        //saidhasidja
    }

}
