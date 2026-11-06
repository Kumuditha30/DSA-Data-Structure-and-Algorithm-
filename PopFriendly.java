
import java.util.LinkedList;
import java.util.Queue;

public class PopFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    void pop() {
        if (q1.isEmpty())
            return;

        System.out.println("Popped: " + q1.remove());
    }

    public static void main(String[] args) {
        PopFriendly s = new PopFriendly();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();
        s.pop();
    }
}
