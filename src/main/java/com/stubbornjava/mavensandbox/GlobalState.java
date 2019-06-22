package com.stubbornjava.mavensandbox;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalState {
    private static final Logger log = LoggerFactory.getLogger(GlobalState.class);
    private static final AtomicLong counter;

    static {
        log.info("Loading Global State");
        counter = new AtomicLong(0);
    }

    public static long getAndIncrement() {
        return counter.getAndIncrement();
    }
}
