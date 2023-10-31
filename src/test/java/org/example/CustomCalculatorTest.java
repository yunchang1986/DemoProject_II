package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomCalculatorTest {
    CustomCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CustomCalculator();
    }

    @Test
    void add() {
        // Arrange
        int a = 1;
        int b = 2;

        // Act
        int actual = calculator.add(a, b);

        // Assert
        int expected = 3;
        assertEquals(expected, actual);
    }
}
