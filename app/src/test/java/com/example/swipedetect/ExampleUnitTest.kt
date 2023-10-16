package com.example.swipedetect

import android.widget.ImageView
import org.junit.Assert.*
import org.junit.Test
import org.junit.Test.None

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    //Mak: 4 JUnit tests for detecting if each side's images exist before running program
    @Test
    fun EastImageExists() {
        assertNotEquals(R.drawable.trees, null)
    }

    @Test
    fun WestImageExists() {
        assertNotEquals(R.drawable.desert, null)
    }

    @Test
    fun SouthImageExists() {
        assertNotEquals(R.drawable.beach, null)
    }

    @Test
    fun NorthImageExists() {
        assertNotEquals(R.drawable.snowymountain, null)
    }
}