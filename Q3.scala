package prac09_22001816

object Q3 {
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", name => {
      val firstPart = name.substring(0, 2).toUpperCase
      val secondPart = name.substring(2).toLowerCase
      firstPart + secondPart
    }))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", name => {
      val lastPart = name.takeRight(1).toUpperCase
      val firstPart = name.dropRight(1).toLowerCase
      firstPart + lastPart
    }))
  }
}

