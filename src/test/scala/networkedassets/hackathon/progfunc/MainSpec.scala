package networkedassets.hackathon.progfunc

import networkedassets.hackathon.progfunc.Main.{abs, fib}
import org.scalatest.FlatSpec

class MainSpec extends FlatSpec {

  "A Abs" should "give the absolute value of the argument" in {
    assert(abs(-10) == 10)
    assert(abs(11) == 11)
  }

  ignore should "calculate values for fibonacci seq" in {
    assert(List(0, 1, 2, 3, 4, 5, 6).map(fib) == List(0, 1, 1, 2, 3, 5, 8))
  }

}
