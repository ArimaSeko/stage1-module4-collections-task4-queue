package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());
        for(String karim: firstList){
        queue.add(karim);
        }
        for(String karim: secondList){
            queue.add(karim);
        }
        return queue;
    }
}
