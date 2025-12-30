class ArrayCircularQueue {

    int[] queue;
    int front, rear, size;

    public ArrayCircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
