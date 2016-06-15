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

  // A definition of factorial, using a local, tail recursive function
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  // Exercise 1: Write a function to compute the nth fibonacci number
  def fib(n: Int): Int = ???
}
