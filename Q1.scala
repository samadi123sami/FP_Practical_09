package prac09_22001816

import scala.io.StdIn
object Q1 {

  val withdraw: Int => Double = deposit =>
    if (deposit>0 && deposit<20000) {
      (deposit*0.02) + deposit
    } else if(deposit>=20000 && deposit<200000){
      (deposit*0.04) + deposit
    }
    else if(deposit>=200000 && deposit<2000000){
      (deposit*0.035) + deposit
    }
    else{
      (deposit*0.065) + deposit
    }

  def main(args: Array[String]): Unit = {
    println("Enter the amount : ")
    var number = StdIn.readLine().toInt
    println("After one year you can withdraw full amount is : " + withdraw(number))
  }
}

