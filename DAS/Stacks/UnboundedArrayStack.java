import java.util.Arrays;

public class UnboundedArrayStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2; 
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T data) {
        if (top + 1 == capacity) {
            resize(capacity * 2);
        }
        stack[++top] = data;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T value = stack[top--];
        if (top + 1 <= capacity / 4) {
            resize(capacity / 2);
        }
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void resize(int newCapacity) {
        capacity = newCapacity;
        stack = Arrays.copyOf(stack, capacity);
    }
}
