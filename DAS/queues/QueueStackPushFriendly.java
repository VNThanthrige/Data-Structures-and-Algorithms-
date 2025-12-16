import java.util.Stack;


public class QueueStackPushFriendly<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueStackPushFriendly() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    
    public void enqueue(T data) {
        stack1.push(data);
    }

  
    public T dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }
}

    

