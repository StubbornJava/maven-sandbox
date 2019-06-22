package com.stubbornjava.mavensandbox.common;

import java.util.concurrent.TimeUnit;
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
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            log.error("failed to sleep", e);
        }
        return counter.getAndIncrement();
    }
}
