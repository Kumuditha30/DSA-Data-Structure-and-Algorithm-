
//QueueStack - push friendly implementation of stack using two queues
import java.util.LinkedList;
import java.util.Queue;

public class PushFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.add(x);
    }

    void pop() {
        if (q1.isEmpty())
            return;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        System.out.println("Popped: " + q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public static void main(String[] args) {
        PushFriendly s = new PushFriendly();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();
        s.pop();
    }
}
