package components;

public class Queue {
    private int[] queueArr;
    private int front;
    private int rear;
    private int maxSize;
    private int qSize = 0;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArr = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    public void enQueue(int data) {
        if (isFull()) {
            reSize(maxSize * 2);
        }
        rear = (rear + 1) % maxSize;
        queueArr[rear] = data;
        qSize++;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queueArr[front];
        queueArr[front] = 0;
        front = (front + 1) % maxSize;
        qSize--;
        if (qSize > 0 && qSize == maxSize / 4) {
            reSize(maxSize / 2);
        }
        return value;
    }

    public void show() {
        for (int i = 0; i < qSize; i++) {
            System.out.println(queueArr[(i + front) % maxSize]);
        }
    }

    public int capacity() {
        return maxSize;
    }

    public int size() {
        return qSize;
    }

    public int front() {
        return front;
    }

    public int rear() {
        return rear;
    }

    public boolean isFull() {
        return qSize == maxSize;
    }

    public boolean isEmpty() {
        return qSize == 0;
    }

    public void reSize(int newSize) {
        int[] newQArray = new int[newSize];
        for (int i = 0; i < qSize; i++) {
            newQArray[i] = queueArr[(i + front) % maxSize];
        }
        front = 0;
        rear = qSize - 1;
        queueArr = newQArray;
        maxSize = newSize;
    }
}
