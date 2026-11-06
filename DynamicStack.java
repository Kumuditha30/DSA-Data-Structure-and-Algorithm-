
public class DynamicStack {
    int[] arr = new int[2];
    int top = -1;

    void resize(int size) {
        int[] temp = new int[size];

        for (int i = 0; i <= top; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    void push(int x) {
        if (top == arr.length - 1) {
            resize(arr.length * 2);
        }

        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    void pop() {
        if (top == -1)
            return;

        System.out.println("Popped: " + arr[top--]);

        if (arr.length > 2 &&
                top + 1 <= arr.length / 4) {
            resize(arr.length / 2);
        }
    }

    public static void main(String[] args) {
        DynamicStack s = new DynamicStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.pop();
        s.pop();
        s.pop();

        System.out.println("Array size: " + s.arr.length);
    }
}
