package HM9number3;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Додавання елементів до стеку
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Розмір стеку: " + stack.size());

        System.out.println("Верхній елемент: " + stack.peek());

        System.out.println("Видалений елемент: " + stack.pop());

        System.out.println("Розмір після видалення: " + stack.size());


        stack.clear();
        System.out.println("Розмір після очищення: " + stack.size());
    }
}