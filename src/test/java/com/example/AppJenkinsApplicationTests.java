package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppJenkinsApplicationTests {

    @Test
    void simpleTestOne() {
        int a = 200 - 100;

        assertEquals(100, a);
    }

    @Test
    void simpleTestTwo() {
        int a = 200 + 100;

        assertEquals(300, a);
    }

}
