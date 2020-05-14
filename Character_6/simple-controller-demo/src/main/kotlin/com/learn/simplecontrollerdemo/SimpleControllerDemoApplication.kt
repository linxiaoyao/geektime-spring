package com.learn.simplecontrollerdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleControllerDemoApplication

fun main(args: Array<String>) {
	runApplication<SimpleControllerDemoApplication>(*args)
}
