object question_5 {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = !(isEven(n))

  def addition(n: Int): Int = n match {
    case x if x-1 == 0 => 0
    case x if isEven(x-1)=> x-1 + addition(x - 1)
    case x => addition(x-1)
  }

  def main(args: Array[String]): Unit = {
    print(addition(6))
  }
}
