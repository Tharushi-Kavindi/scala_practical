object PatternMatching {
  def main(args: Array[String]): Unit = {
    println("Enter the integer Number:")

    try {
      val input: Int = scala.io.StdIn.readInt()

      def matchNumber(input: Int): Unit = {
        input match {
          case x if x <= 0 => println("Negative/Zero is input")
          case x if x % 2 == 0 => println("Even number is given")
          case _ => println("Odd number is given")
        }
      }

      matchNumber(input)

    } catch {
      case _: NumberFormatException => println("Invalid input. Please provide a valid integer.")
    }
  }
}
