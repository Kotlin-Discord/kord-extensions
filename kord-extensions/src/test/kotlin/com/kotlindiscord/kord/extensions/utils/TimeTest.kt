package com.kotlindiscord.kord.extensions.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import java.time.Duration

/**
 * Tests for [Duration] extension functions.
 */
class TimeTest {

    /**
     * Check that `.toHuman()` returns the correct human-readable representation of the given [Duration].
     */
    @Test
    fun `duration to human-readable representation`() {
        assertNull(Duration.ofMillis(1).toHuman())
        assertNull(Duration.ofSeconds(0).toHuman())

        assertEquals("1 second", Duration.ofSeconds(1).toHuman())
        assertEquals("2 seconds", Duration.ofSeconds(2).toHuman())

        assertEquals("1 minute", Duration.ofMinutes(1).toHuman())
        assertEquals("2 minutes", Duration.ofMinutes(2).toHuman())

        assertEquals("1 hour", Duration.ofHours(1).toHuman())
        assertEquals("2 hours", Duration.ofHours(2).toHuman())

        assertEquals("1 day", Duration.ofDays(1).toHuman())
        assertEquals("2 days", Duration.ofDays(2).toHuman())

        assertEquals(
            "2 days, 5 hours and 1 minute",

            Duration.ofDays(2)
                .plusHours(5)
                .plusMinutes(1)
                .plusSeconds(0)
                .toHuman()
        )
    }
}
