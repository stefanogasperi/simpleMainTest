package com.gas.edu.thread.blockingqueue.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue queue;
    final String name;

    public Consumer(BlockingQueue q, String name) { queue = q;
        this.name = name;
    }
    public void run() {
        try {
            while(true) { consume((String)queue.take()); }
        } catch (InterruptedException ex) {
            //... handle ...
            }
    }
    void consume(String x) {
        System.out.println("consumed by #"+name+" => "+x);
        //...
    }
}