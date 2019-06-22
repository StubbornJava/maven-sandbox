package com.stubbornjava.mavensandbox.childc;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stubbornjava.mavensandbox.common.GlobalState;

public class TestClassOne {
    private static final Logger log = LoggerFactory.getLogger(TestClassOne.class);

    @Test
    public void testOne() {
        log.info("Test class one test one incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }

    @Test
    public void testTwo() {
        log.info("Test class one test two incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }

    @Test
    public void testThree() {
        log.info("Test class one test three incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }
}
