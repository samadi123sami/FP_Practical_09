package prac09_22001816

import scala.io.StdIn
object Q1 {

  val categorize: Int => Float = n =>
    if (n>0 && n<20000) {
      n*102/100
    } else if(n>=20000 && n<200000){
      n*104/100
    }
    else if(n>=200000 && n<2000000){
      n*104/100
    }
    else{
      (n*106.5f)/100
    }


  def main(args: Array[String]): Unit = {
    println("enter the amount : ")
    var number = StdIn.readLine().toInt
    println("after one year you can withdraw full amount is : " + categorize(number))
  }

}
