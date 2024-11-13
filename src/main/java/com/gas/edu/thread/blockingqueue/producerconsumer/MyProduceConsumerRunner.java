package com.gas.edu.thread.blockingqueue.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyProduceConsumerRunner {
    public MyProduceConsumerRunner() {
        BlockingQueue q = new LinkedBlockingQueue();
        Producer p = new Producer(q);
        Consumer c1 = new Consumer(q,"ONE");
        Consumer c2 = new Consumer(q,"TWO");
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}
