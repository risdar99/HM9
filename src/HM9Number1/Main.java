package HM9Number1;

import HM9Number1.MyArrayList;

public class Main {
    public static void main(String[] args) {
       MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        System.out.println("Розмір списку: " + myArrayList.size());
        System.out.println("Елемент за індексом " + myArrayList.get(1));

        myArrayList.remove(1);
        System.out.println("Розмір списку після видалення індексу: "  + myArrayList.size());
        myArrayList.clear();
        System.out.println("Розмір списку після видалення: " + myArrayList.size());







    }
}
