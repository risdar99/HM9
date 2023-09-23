package HM9number4;

public class Main {
    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);

        System.out.println("Розмір черги: " + myQueue.size());


        System.out.println("Перший елемент: " + myQueue.peek());


        System.out.println("Видалений елемент: " + myQueue.poll());


        System.out.println("Розмір після видалення: " + myQueue.size());


        myQueue.clear();

        System.out.println("Розмір після очищення: " + myQueue.size());
    }

}
