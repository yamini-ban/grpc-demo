package com.knoldus.example

import example.hello.HelloRequest

object Example{
  def main(args: Array[String]): Unit = {
    val hello = HelloRequest("hello")
    println(HelloRequest.parseFrom(hello.toByteArray))
  }
}
