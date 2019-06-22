package com.stubbornjava.mavensandbox.childa;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stubbornjava.mavensandbox.common.GlobalState;

public class TestClassThree {
    private static final Logger log = LoggerFactory.getLogger(TestClassThree.class);

    @Test
    public void testOne() {
        log.info("Test class three test one incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }

    @Test
    public void testTwo() {
        log.info("Test class three test two incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }

    @Test
    public void testThree() {
        log.info("Test class three test three incrementing counter... current value: {}", GlobalState.getAndIncrement());
    }
}
