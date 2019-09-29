package com.example.kotlin

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
open class KotlinApplication

fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)
	println("helloworld")
}
