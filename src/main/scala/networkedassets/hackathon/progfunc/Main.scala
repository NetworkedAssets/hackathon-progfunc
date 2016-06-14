package networkedassets.hackathon.progfunc

object Main {

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  // Exercise 1: Write a function to compute the nth fibonacci number
  def fib(n: Int): Int = ???
}
