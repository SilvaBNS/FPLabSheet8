object Q1 {
  def main(args: Array[String]): Unit = {
    val deposit = scala.io.StdIn.readLine("Enter the amount to deposit : ").toDouble

    val calculateInterest = (deposit : Double) => {  //val calculateInterest: Double => Double = deposit =>
      if (deposit <= 20000) 0.02 * deposit
      else if (deposit <= 200000) 0.04 * deposit
      else if (deposit <= 2000000) 0.035 * deposit
      else 0.065 * deposit
    }


    val interestAmount = calculateInterest(deposit)
    println(s"The interest for a deposit of Rs. $deposit is Rs. $interestAmount")

  }

}

