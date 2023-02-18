package com.datastruture;
class Node1 {
        int data;
        com.datastruture.Node1 next;
        public Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class Queue1 {
        private static com.datastruture.Node1 rear = null, front = null;
        private static int count = 0;
        public static int dequeue()
        {
            if (front == null) {
                System.out.println("\nQueue Underflow:");
                System.exit(-1);
            }
            com.datastruture.Node1 temp = front;
            System.out.printf("Removing %d\n", temp.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
            count -= 1;
            return temp.data;
        }
        public void enqueue(int item) {
            com.datastruture.Node1 node = new com.datastruture.Node1(item);
            System.out.println("Inserting:" + item);
            if (front == null) {
                front = node;
                rear = node;
            } else {
                rear.next = node;
                rear = node;
            }
            count += 1;
        }
        public static int peek() {
            if (front == null) {
                System.exit(-1);
            }
            return front.data;
        }
        public static boolean isEmpty() {
            return rear == null && front == null;
        }
        private static int size() {
            return count;
        }
    }
    public  class Dequeue{
        public static void main(String[] args) {
            com.datastruture.Queue queue = new com.datastruture.Queue();
            queue.enqueue(56);
            queue.enqueue(30);
            queue.enqueue(70);
            System.out.println("the front element is:" + queue.peek());
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            if (queue.isEmpty()) {
                System.out.println("the queue is empty:");
            } else {
                System.out.println("the queue is not empty:");
            }
        }
    }

