package com.datastruture;


    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
   class Queue {
        private static Node rear = null, front = null;
        private static int count = 0;
        public static int dequeue()
        {
            if (front == null) {
                System.out.println("\nQueue Underflow:");
                System.exit(-1);
            }
            Node temp = front;
            System.out.printf("Removing %d\n", temp.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
            count -= 1;
            return temp.data;
        }
        public void enqueue(int item) {
            Node node = new Node(item);
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
  public  class Create{
        public static void main(String[] args) {
            Queue queue = new Queue();
            queue.enqueue(56);
            queue.enqueue(30);
            queue.enqueue(70);
            System.out.println("the front element is:" + queue.peek());
            if (queue.isEmpty()) {
                System.out.println("the queue is empty:");
            } else {
                System.out.println("the queue is not empty:");
            }
        }
    }
