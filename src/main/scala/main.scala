
@main def hello: Unit = 
  println("Hello world!")
  val greeter = Greeter("Jack")
  println(greeter.hi)
  println(greeter.bye)

