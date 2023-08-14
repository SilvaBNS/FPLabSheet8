object Q2 {
  def main(args : Array[String]): Unit = {
    val inputNum = scala.io.StdIn.readLine("Enter a number : ").toInt

    val value : Int   => Unit = (num : Int) => {
          num match {
            case num if (num <= 0) => println("Negative/ Zero is input")
            case num if (num % 2 == 0) => println("Even number is given")
            case _ => println("Odd number is given")
          }

      }

    value(inputNum)
  }

}

