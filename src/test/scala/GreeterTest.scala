
class GreeterSuite extends munit.FunSuite {
  test("hi returns correct string") {
    val greeter = Greeter("Jack")
    val hiMsg = greeter.hi
    assertEquals(hiMsg, "hi Jack")
  }
  
  test("bye returns correct string") {
    val greeter = Greeter("Aoife")
    val hiMsg = greeter.bye
    assertEquals(hiMsg, "bye Aoife")
  }
}
