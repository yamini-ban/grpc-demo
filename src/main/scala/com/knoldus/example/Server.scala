package com.knoldus.example

import example.hello.GreeterGrpc.Greeter
import example.hello.{HelloReply, HelloRequest}

import scala.concurrent.Future

class Server extends Greeter{
  override def sayHello(request: HelloRequest) ={
    val reply = HelloReply(message = "Hello " + request.name)
    Future.successful(reply)
  }
}
