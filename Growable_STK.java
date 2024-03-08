import pkg_Stack.Interface_STK;

public class Growable_STK implements Interface_STK {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Growable_STK(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }
    @Override
    public void push(int item) {
        if (isFull()) {
            int[] newArray = new int[capacity * 2];
            System.arraycopy(stackArray, 0, newArray, 0, capacity);
            stackArray = newArray;
            capacity *= 2;
        }
        stackArray[++top] = item;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == capacity - 1);
    }
}
