package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        int size = firstQueue.size() + secondQueue.size();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(size);
        arrayDeque.add(firstQueue.poll());
        arrayDeque.add(firstQueue.poll());
        arrayDeque.add(secondQueue.poll());
        arrayDeque.add(secondQueue.poll());
        while (!firstQueue.isEmpty()&&!secondQueue.isEmpty()){
            firstQueue.add(arrayDeque.getLast());
            arrayDeque.remove(arrayDeque.getLast());
            secondQueue.add(arrayDeque.getLast());
            arrayDeque.remove(arrayDeque.getLast());
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(secondQueue.poll());
            arrayDeque.add(secondQueue.poll());
        }
        return arrayDeque;
    }
}
