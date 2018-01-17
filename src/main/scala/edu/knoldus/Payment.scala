package edu.knoldus

class Payment {

  def handlingOfPayment(amount: Double, paymentmode: String): Double =
  {
    paymentmode.toUpperCase match {

      case ("PAYTM" | "FREECHARGE")  => amount + amount * 0.02
      case ("NETBANKING") => amount + 5
      case ("CARD") => amount + 1.5
      case ("CASH") => amount
    }
  }

}

