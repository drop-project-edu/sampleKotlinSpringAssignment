package org.dropproject.samples.samplekotlinspringassignment

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun greet(name: String): String = "Hello, $name!"
}