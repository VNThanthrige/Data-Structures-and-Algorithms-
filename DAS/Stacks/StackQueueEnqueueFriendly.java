import java.util.LinkedList;
import java.util.Queue;

public class StackQueueEnqueueFriendly<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;

    public StackQueueEnqueueFriendly() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    
    public void push(T data) {
        queue1.add(data);
    }

    
    public T pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        T top = queue1.remove();

        
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    public T top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        T top = queue1.peek();
        queue2.add(queue1.remove());

        
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int size() {
        return queue1.size();
    }
}

