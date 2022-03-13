package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void castTest() {
        Assertions.assertEquals(1, Main.int2byte(1));
        Assertions.assertEquals(1, Main.int2short(1));
        Assertions.assertEquals(1, Main.int2char(1));
        Assertions.assertEquals("123", Main.int2String(123));
        Assertions.assertEquals("-123", Main.int2String(-123));
        Assertions.assertEquals(123, Main.string2int("123"));
        Assertions.assertEquals(-123, Main.string2int("-123"));
        Assertions.assertEquals(123, Main.castLong2int(123L));
        Assertions.assertEquals(123L, Main.double2Long(123d));
        Assertions.assertTrue(Math.abs(0.5 - Main.string2double("0.5")) < 1e-5);
        Assertions.assertTrue(Math.abs(0.123 - Main.string2double("0.123")) < 1e-5);
        Assertions.assertTrue(Math.abs(1e-5 - Main.string2double("1e-5")) < 1e-5);
    }
}
