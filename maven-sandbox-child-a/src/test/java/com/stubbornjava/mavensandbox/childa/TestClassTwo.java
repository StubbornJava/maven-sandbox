package com.stubbornjava.mavensandbox.childa;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stubbornjava.mavensandbox.common.GlobalState;

public class TestClassTwo {
    private static final Logger log = LoggerFactory.getLogger(TestClassTwo.class);

    @Test
    public void testOne() {
        log.info("Test class two test one incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }

    @Test
    public void testTwo() {
        log.info("Test class two test two incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }

    @Test
    public void testThree() {
        log.info("Test class two test three incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }
}
