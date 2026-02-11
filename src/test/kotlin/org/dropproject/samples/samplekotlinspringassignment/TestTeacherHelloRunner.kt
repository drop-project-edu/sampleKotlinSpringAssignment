package org.dropproject.samples.samplekotlinspringassignment

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.system.CapturedOutput
import org.springframework.boot.test.system.OutputCaptureExtension

@SpringBootTest
@ExtendWith(OutputCaptureExtension::class)
class TestTeacherHelloRunner {

    @Autowired
    lateinit var helloRunner: HelloRunner

    @Test
    fun `runner prints greeting`(output: CapturedOutput) {
        (helloRunner as CommandLineRunner).run()
        assertTrue(output.out.contains("Hello, World!"))
    }
}