package HM9number3;

public class MyStack {
    private Object[] stack;
    private int size;

    public MyStack() {
        stack = new Object[10];
        size = 0;
    }

    public void clear() {
        for (int i = 0; i < stack.length; i++) {
            stack[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }
        return stack[size - 1];
    }

    public Object pop() {
        if (size == 0) {
            return null;
        }
        Object value = stack[size - 1];
        stack[size - 1] = null;
        return value;
    }

    public void push(Object value) {
        ensureCapacity();
        stack[size] = value;
        size++;
    }

    private void ensureCapacity() {
        if (size > stack.length) {
            int newCapacity = stack.length * 2;
            Object[] newStack = new Object[newCapacity];
            System.arraycopy(stack, 0, newStack, 0, size);
            stack = newStack;
        }
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < stack.length; i++) {
            stack[i] = stack[i + 1];
        }
        stack[size - 1] = null;
        size--;

    }
}

