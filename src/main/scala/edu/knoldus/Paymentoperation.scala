package edu.knoldus
import org.apache.log4j.Logger


object Paymentoperation extends App {

  val log = Logger.getLogger(this.getClass)
  val amount = 50
  val mode = "Card"
  val payment1 = new Payment
  log.info(" .....Tiffin Service.....  \n")
  log.info("You have to Pay Rs")
  log.info(payment1.handlingOfPayment(amount, mode))
}
