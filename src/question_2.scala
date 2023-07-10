object question_2 {
  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case _ => GCD(b, a % b)
  }

  def primeSeq(n: Int, start:Int=2): Unit = start match {
    case x if x == n => if (prime(x)) print(x+" ")// Base case to stop recursion
    case x if prime(x) =>
      print(x + " ")
      primeSeq(n, x+1)
    case x =>
      primeSeq(n, x+1)
  }

  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }
}
