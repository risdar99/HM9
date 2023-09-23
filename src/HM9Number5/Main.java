package HM9Number5;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> MyHashMap = new MyHashMap<>();

        MyHashMap.put("один", 1);
        MyHashMap.put("два", 2);
        MyHashMap.put("три", 3);

        System.out.println("Значення для ключа 'два': " + MyHashMap.get("два"));
        System.out.println("Значення для ключа 'чотири': " + MyHashMap.get("чотири"));

        MyHashMap.remove("два");
        System.out.println("Значення для ключа 'два' після видалення: " + MyHashMap.get("два"));

        System.out.println("Розмір: " + MyHashMap.size());

        MyHashMap.clear();
        System.out.println("Розмір після очищення: " + MyHashMap.size());
    }
}
