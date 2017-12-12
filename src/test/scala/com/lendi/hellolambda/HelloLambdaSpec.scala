package com.lendi.hellolambda

import org.scalatest._

class HelloLambdaSpec extends FlatSpec with Matchers {
  behavior of "MyHandler::handler"

  it should "return a Greeting" in {
    val input = Name("Test")

    val expected = "Hello Test"
    val greeting = new MyHandler().handler(input,_)
    println(greeting)
  }
}
