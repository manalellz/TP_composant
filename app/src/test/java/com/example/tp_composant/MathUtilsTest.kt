package com.example.tp_composant

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MathUtilsTest {

    private val math = MathUtils()

    @Test
    fun testAdd() {
        assertEquals(10, math.add(5, 5))
        assertEquals(15, math.add(10, 5))
    }

    @Test
    fun testSubtract() {
        assertEquals(5, math.subtract(10, 5))
        assertEquals(0, math.subtract(5, 5))
    }

    @Test
    fun testDivide() {
        assertEquals(2.0, math.divide(10, 5), 0.001)
        assertEquals(2.5, math.divide(5, 2), 0.001)
    }

    @Test
    fun testDivideByZero() {
        assertThrows(IllegalArgumentException::class.java) {
            math.divide(10, 0)
        }
    }

    @Test
    fun testIsEven() {
        assertTrue(math.isEven(4))
        assertTrue(math.isEven(10))
    }

    @Test
    fun testIsOdd() {
        assertFalse(math.isEven(5))
        assertFalse(math.isEven(7))
    }
}