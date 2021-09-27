/*
 * This file contains sample JUnit test cases for Airplane.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class AirplaneTest {
    Airplane a;

    @Before
    public void setUp() throws Exception {
        a = new Airplane();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1100, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        a.upgradeSpeed();
        assertEquals(1200, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100000000, a.getPrice());
    }

}