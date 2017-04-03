package foo

object ScalaFoo {
  def main(args: Array[String]): Unit = {
    println("Hello Scala!")
    println(s"Java String: ${JavaBar.javaString}")
    println(s"Scala String: ${ScalaBar.scalaString}")
  }
}

object ScalaBar {
  val scalaString = "This is a Scala String!"
}
