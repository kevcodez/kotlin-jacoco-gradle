package de.kevcodez

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimpleServiceTest {

    val simpleService = SimpleService()

    @Test
    fun `simple method test`() {
        val result = simpleService.simpleMethod(true)
        assertEquals(1, result)
    }

}