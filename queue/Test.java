package edu.zut.cn.queue;

public class Test {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.printf();
        arrayQueue.add(1);
        arrayQueue.printf();
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.printf();
        int i = arrayQueue.get();
        arrayQueue.printf();
        arrayQueue.add(4);
        arrayQueue.printf();
    }
}
