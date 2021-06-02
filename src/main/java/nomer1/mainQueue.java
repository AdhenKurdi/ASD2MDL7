package nomer1;
public class mainQueue {
    public static void main(String[] args) {
        queue newQueue = new queue(10);
        newQueue.enqueue(40);
        newQueue.display();
        newQueue.enqueue(33);
        newQueue.display();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
        newQueue.enqueue(60);
        newQueue.display();
        System.out.println("yang diambil dari antrian = "+newQueue.dequeue());
        newQueue.display();
        System.out.println("yang diambil dari antrian = "+newQueue.dequeue());
        newQueue.display();
        newQueue.enqueue(54);
        newQueue.display();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
    }
}
