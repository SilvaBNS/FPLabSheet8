object Q3 {
  def main(args : Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine("Enter the string : ")
    println("Enter the number of the formatting type from the list : ")
    println("   1 - Format to uppercase")
    println("   2 - Format only the second letter to uppercase")
    println("   3 - Format to lowercase")
    println("   4 - Format only the last letter to uppercase")
    val choice = scala.io.StdIn.readLine("Enter the choice : ").toInt

    val outputStr : (String, Int) => String = (inputString : String, choice : Int )=> {
      choice match {
        case choice if (choice == 1) => inputString.toUpperCase()
        case choice if (choice == 2) => inputString.head.toString + inputString.charAt(1).toString.toUpperCase() + inputString.drop(2).toString
        case choice if (choice == 3) => inputString.toLowerCase()
        case choice if (choice == 4) => inputString.init.toString+inputString.last.toString.toUpperCase()
      }

    }
    val result = outputStr(inputString, choice)
    println(result)
  }


}

