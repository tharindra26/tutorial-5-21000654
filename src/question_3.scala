object question_3 {
  def addition(n:Int):Int=n match{
    case x if x==1 => 1
    case x =>x+addition(x-1)
  }
  def main(args: Array[String]): Unit = {
    println(addition(5))
  }
}
