package prac09_22001816

import scala.io.StdIn
object Q2 {

  val numbers: Int => String = n =>
    if (n<0) {
      "Negative"
    } else if(n==0){
      "Zero"
    }
    else if(n>0 && n%2==0){
      "Even"
    }
    else{
      "Odd"
    }

  def main(args: Array[String]): Unit = {
    println("Enter a Number : ")
    val number = StdIn.readLine().toInt
    println("Given Number is : " + numbers(number))
  }
}
