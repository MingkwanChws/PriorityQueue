package com.company;

public class Main {

    public static void main(String[] args) {
//        MyPQueue queue = new MyPQueue();
//        queue.enqueue(100);
//        queue.enqueue(70);
//        queue.enqueue(85);
//        queue.enqueue(90);
////        queue.enqueue(9);
////        queue.enqueue(8);
//       // queue.remove();
//        System.out.println(queue.front());
//        System.out.println(queue.toString());
        MyPQueueF q = new MyPQueueF();
        q.enqueue(10);
        q.enqueue(5);
        q.enqueue(7);
        System.out.println(q.toString());
    }
}
