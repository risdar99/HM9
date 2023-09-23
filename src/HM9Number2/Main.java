package HM9Number2;

public class Main {
    public static void main (String [] args){
        MyLinkedList<Integer> myList  = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println("Розмір списку: " + myList.size());

        int index = 1;
        System.out.println("Елемент за індексом " + index + ": " + myList.get(index));

        myList.remove(index);
        System.out.println("Розмір списку після видалення індексу: " + myList.size());

        myList.clear();
        System.out.println("Розмір списку після видалення: " + myList.size());
    }



}
