package HM9Number5;



public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 8;
    private Node<K, V>[] buckets;
    private int size;


    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public MyHashMap(int capacity) {
        buckets = new Node[capacity];
        size = 0;

    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < buckets.length ; i++) {
            buckets[i] = null;
        }
        size = 0;

    }


    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> newNode = new Node<>(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
            size++;
        } else {
            Node<K, V> current = buckets[index];
            Node<K, V> prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }

            prev.next = newNode;
            size++;
        }
    }

    public V get(K key) {
        int index = getIndex(key);

        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }
    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;
        private Node<K, V> previous;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
}