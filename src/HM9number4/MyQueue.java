package HM9number4;

import HM9Number2.MyLinkedList;

public class MyQueue<T> {

    Node<T> head;
    Node<T> tail;
    int size;
    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

   public int size(){
        return size;
   }

   public T peek (){
        if(head == null){
            return null;
        }
        return head.value;
   }

    public T poll() {
        if (head == null) {
            return null;
        }

        T value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return value;
    }

    private static class Node<T>{

        private T value;
        Node <T> previous;
        Node <T> next;
        public Node( T value) {
            this.value = value;

        }


    }

}





















