package com.gas.edu.thread.blockingqueue.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue queue;
    Producer(BlockingQueue q) { queue = q; }
    public void run() {
        try {
            while(true) { queue.put(produce());
            Thread.sleep(1000L);}
        } catch (InterruptedException ex) {
            //... handle ...
            //
        }
    }
    String produce() {
            //...
            return  "produced @"+System.currentTimeMillis();
    }
}