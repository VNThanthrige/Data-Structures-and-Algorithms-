import java.util.Stack;

public class QueueStackPopFriendly<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueStackPopFriendly() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    
    public void enqueue(T data) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    
    public T dequeue() {
        if (stack1.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int size() {
        return stack1.size();
    }
}
