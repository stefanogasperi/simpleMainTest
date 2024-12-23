package com.gas.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {
    @Test
    public void appTest() {
        App app = new App();
        assertNotNull(app);
    }
}
