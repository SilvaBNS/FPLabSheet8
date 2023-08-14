object Q3 {
  def main(args: Array[String]): Unit = {
    val inputName = scala.io.StdIn.readLine("Enter the name that you want to format - ")

    println("Enter the number of the formatting type from the list : ")
    println("   1 - Format to uppercase")
    println("   2 - Format only the second letter to uppercase")
    println("   3 - Format to lowercase")
    println("   4 - Format only the last letter to uppercase")
    println()

    val choice = scala.io.StdIn.readLine("Enter your choice - ").toInt

    val formattedName = selectChoice(choice, inputName)
    println("Formatted based on the provided formatFunction - " + formattedName)
  }

  val toUpper: String => String = (inputString: String) => {
    inputString.toUpperCase
  }

  val toLower: String => String = (inputString: String) => {
    inputString.toLowerCase
  }

  val formatNames: (String, String => String) => String = (name, formatFunction) => {
    formatFunction(name)
  }

  val selectChoice: (Int, String) => String = (choice, inputName) => {
    choice match {
      case 1 => formatNames(inputName, toUpper)
      case 2 => formatNames(inputName, str => str.head + (str.charAt(1).toUpper + str.drop(2)))
      case 3 => formatNames(inputName, toLower)
      case 4 => formatNames(inputName, str => str.init + str.last.toUpper)
      case _ => "You made an Invalid choice"
    }
  }
}
