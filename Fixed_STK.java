import pkg_Stack.Interface_STK;

public class Fixed_STK implements Interface_STK {

    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor
    public Fixed_STK(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }
    @Override
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = item;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Or throw an exception
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
