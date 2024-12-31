package com.gas.edu.thread.blockingqueue.producerconsumer;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;

@Slf4j
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
        log.info("consumed by #{} => {}",name,x);
        //...
    }
}