package org.dropproject.samples.samplekotlinspringassignment

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestTeacherGreetingService {

    @Autowired
    lateinit var greetingService: GreetingService

    @Test
    fun `greet returns hello message with name`() {
        assertEquals("Hello, World!", greetingService.greet("World"))
    }

    @Test
    fun `greet returns hello message with different name`() {
        assertEquals("Hello, Kotlin!", greetingService.greet("Kotlin"))
    }
}