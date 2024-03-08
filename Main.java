import pkg_Stack.Interface_STK;

public class Main {
    public static void main(String[] args) {
//        Fixed Stack
        Interface_STK fixedStack = new Fixed_STK(5);
        fixedStack.push(1);
        fixedStack.push(2);
        fixedStack.push(3);
        System.out.println("Popped element: " + fixedStack.pop());
        System.out.println("Popped element: " + fixedStack.pop());
        System.out.println("Popped element: " + fixedStack.pop());

        //Growable Stack
        Interface_STK growableStack = new Growable_STK(3);
        growableStack.push(1);
        growableStack.push(2);
        growableStack.push(3);
        growableStack.push(4);
        growableStack.push(5);
        System.out.println("Popped element: " + growableStack.pop());
        System.out.println("Popped element: " + growableStack.pop());
        System.out.println("Popped element: " + growableStack.pop());
        System.out.println("Popped element: " + growableStack.pop());
        System.out.println("\n\n-----------PART 2-----------");
        Result r= new Result();
        r.dispResults();
    }
}