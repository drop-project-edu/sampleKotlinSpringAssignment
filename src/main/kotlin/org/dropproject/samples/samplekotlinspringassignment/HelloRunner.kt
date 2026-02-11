package org.dropproject.samples.samplekotlinspringassignment

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class HelloRunner(private val greetingService: GreetingService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println(greetingService.greet("World"))
    }
}