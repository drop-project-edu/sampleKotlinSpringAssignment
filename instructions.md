# Sample Kotlin Spring Assignment

This is a simple Kotlin Spring Boot assignment to experiment with Drop Project.

## Introduction

In this assignment you will create a small Spring Boot application that uses **dependency injection**.
You will implement two classes:

1. A **service** that builds greeting messages.
2. A **command-line runner** that uses that service to print a greeting when the application starts.

## Instructions

* Create a Kotlin Spring Boot project in your IDE with the package `org.dropproject.samples.samplekotlinspringassignment`.
  Start by creating a file called `SampleKotlinSpringAssignmentApplication.kt` in that package with the following code:

  ```kotlin
  package org.dropproject.samples.samplekotlinspringassignment

  import org.springframework.boot.autoconfigure.SpringBootApplication
  import org.springframework.boot.runApplication

  @SpringBootApplication
  class SampleKotlinSpringAssignmentApplication

  fun main(args: Array<String>) {
      runApplication<SampleKotlinSpringAssignmentApplication>(*args)
  }
  ```

  This is the entry point of your Spring Boot application. **Do not modify it**.

* Create a file called `GreetingService.kt` in the package above and implement a class called `GreetingService`.
  This class must:
    - Be annotated with `@Service` (from `org.springframework.stereotype.Service`), so that Spring registers it as a bean.
    - Contain a function with the following signature:

      `fun greet(name: String): String`

      This function must return the string `"Hello, <name>!"`, where `<name>` is replaced by the argument.
      For example, `greet("World")` must return `"Hello, World!"` and `greet("Kotlin")` must return `"Hello, Kotlin!"`.

* Create a file called `HelloRunner.kt` in the package above and implement a class called `HelloRunner`.
  This class must:
    - Be annotated with `@Component` (from `org.springframework.stereotype.Component`).
    - Implement the `CommandLineRunner` interface (from `org.springframework.boot.CommandLineRunner`).
    - Receive a `GreetingService` instance through **constructor injection**.
    - In its `run` method, use the injected `GreetingService` to print `"Hello, World!"` to the standard output
      (i.e., call `greetingService.greet("World")` and print the result using `println`).

* Create an `AUTHORS.txt` file in the root of your project with your student id and name. For example:

  ```
  a12345;John Doe
  ```

The idea of this file is to allow group project submissions.

* Create a zip file of your project and drop it on the area above these instructions.
  In a few seconds, Drop Project will give you a report with some metrics about your project.