package com.gas.edu.predicate;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;
import java.util.stream.IntStream;

@Slf4j
public class AppPredicate {
    private final Predicate<Integer> predicate = a -> a<3;

    public void useMe() {
        log.info("start..");
        IntStream.range(0,6).forEach(this::apply);
        log.info("finish..");
        IntStream.range(9,25).forEach(this::combine);
    }

    private void apply(int i) {
        log.info("check {} -> {}",i,predicate.test(i));
    }

    private void combine(int i) {
        Predicate<Integer> p = predicate
                .or(it-> it>10)
                .and(it-> it<20);
        log.info("check combine{} -> {}",i,p.test(i));
    }
}
