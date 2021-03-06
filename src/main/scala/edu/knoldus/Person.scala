
package edu.knoldus

import org.apache.log4j.Logger

import scala.util.Random

abstract class Person

case class Gamer() extends Person

case class Trainer() extends Person

case class Blogger(bloglist: Map[String, Int]) extends Person


object Person extends App {

  val log = Logger.getLogger(this.getClass)

  def action(person: Person): String = {

    person match {
      case Gamer() => val b = 6
                      val a = Random.nextInt(b)
                      log.info(s"generated number is $a")
                      log.info("\n")
                      diceHandling(a, 1)
      case Trainer() => log.info("\n")
                        val c = 50
                        s"Trainer Response: Class strength is ${Random.nextInt(c)} \n"
      case Blogger(bloglist) => updationOfBlogging(bloglist)
    }
  }

  private def diceHandling(number: Int, count: Int): String = {


    number match {
      case 1 | 6 if (count < 3) => val b = 6
                                   val a = Random.nextInt(b)
                                   log.info(s"generated number is $a")
                                   log.info("\n")
                                   diceHandling(a, count + 1)
      case 1 | 6 if (count == 3) => "Gamer Response : you are the winner"
      case 2 | 3 | 4 | 5 => "Gamer Response : you are the looser"
      case 0 => " this is not possible"

    }
  }

  private def updationOfBlogging(bloglist: Map[String, Int]): String = {

    val c = bloglist.keys
    val d = c.toList(Random.nextInt(c.size))
    val e = bloglist(d)
    val newbloglist = bloglist + (d -> (e + 1))
    val favtopic  = newbloglist.keysIterator.max
    s" Blogger Response: maximum blogging is done in $favtopic"
  }
  val bloglist = Map("c++" -> 1, "java" -> 5, "C#" ->4 )
  log.info(action(Gamer()))
  log.info(action(Trainer()))
  log.info(action(Blogger(bloglist)))
}



