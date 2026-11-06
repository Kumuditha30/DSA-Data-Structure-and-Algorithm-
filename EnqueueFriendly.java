
//StackQueue - Implement a queue using two stacks such that the enqueue operation is O(1) and the dequeue operation is O(n).
import java.util.Stack;

public class EnqueueFriendly {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    void dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty())
            return;

        System.out.println("Dequeued: " + s2.pop());
    }

    public static void main(String[] args) {
        EnqueueFriendly q = new EnqueueFriendly();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.dequeue();
    }
}
