package com.example.electricity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ElectricityBillAppTest {

    @Test
    void testZeroUnits() {
        assertEquals(0.00, ElectricityBillApp.calculateBill(0), 0.01);
    }

    @Test
    void testLowConsumption() {
        assertEquals(75.00, ElectricityBillApp.calculateBill(50), 0.01);
    }

    @Test
    void testSecondSlab() {
        assertEquals(275.00, ElectricityBillApp.calculateBill(150), 0.01);
    }

    @Test
    void testThirdSlab() {
        assertEquals(800.00, ElectricityBillApp.calculateBill(300), 0.01);
    }

    @Test
    void testHighConsumption() {
        assertEquals(2200.00, ElectricityBillApp.calculateBill(600), 0.01);
    }

    @Test
    void testNegativeUnits() {
        assertThrows(
            IllegalArgumentException.class,
            () -> ElectricityBillApp.calculateBill(-10)
        );
    }
}