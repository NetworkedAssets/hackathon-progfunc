package networkedassets.hackathon.progfunc

import networkedassets.hackathon.progfunc.List._
import org.scalatest.FunSuite

class ListSpec extends FunSuite {

  test("sum") {
    assert(sum(Nil) == 0, "sum of empty list should be 0")
    assert(sum(List(5)) == 5, "sum of single-element list should be the element")
    assert(sum(List(1, 2, 3, 4)) == 10, "sum of list should be sum of its elements")
  }

  test("append") {
    assert(append(Nil, Nil) == Nil, "append of two empty lists should be empty list")
    assert(append(Nil, List(3)) == List(3), "append of empty list to a list should be list")
    assert(append(List(3), Nil) == List(3), "append of list to empty list should be list")
    assert(append(List(1, 2), List(3)) == List(1, 2, 3), "append of list to one-element list should be concatenation of lists")
    assert(append(List(1), List(2, 3)) == List(1, 2, 3), "append of one-element list to list should be concatenation of lists")
    assert(append(List(1, 2), List(3, 4)) == List(1, 2, 3, 4), "append of two lists should be concatenation of lists")
  }

  test("tail") {
    assert(tail(Nil) == Nil, "tail of Nil should be Nil")
    assert(tail(List(3)) == Nil, "tail of single-element list should be Nil")
    assert(tail(List(1, 2, 3)) == List(2, 3), "tail of list should be rest")
  }

  test("setHead") {
    assert(setHead(Nil, 1) == Nil, "setHead of empty list should be empty list")
    assert(setHead(List(2), 1) == List(1), "setHead of single-element list should be two-element list")
    assert(setHead(List(3, 2), 1) == List(1, 2), "setHead of two-element list should be three-element list")
  }

  test("drop") {
    assert(drop(Nil, 0) == Nil, "drop of zero elements from empty list is empty list")
    assert(drop(Nil, 1) == Nil, "drop of one element from empty list is empty list")
    assert(drop(Nil, 10) == Nil, "drop of many elements from empty list is empty list")
    assert(drop(List(3), 0) == List(3), "drop of zero elements from single-element list is the list")
    assert(drop(List(3), 1) == Nil, "drop of one element from single-element list is empty list")
    assert(drop(List(3), 10) == Nil, "drop of many elements from single-element list is empty list")
    assert(drop(List(1, 2, 3), 0) == List(1, 2, 3), "drop of zero elements from list is list")
    assert(drop(List(1, 2, 3), 1) == List(2, 3), "drop of one elements from list is list without 1st element")
    assert(drop(List(1, 2, 3), 2) == List(3), "drop of n elements from list is list without 1st n elements")
    assert(drop(List(1, 2, 3), 10) == Nil, "drop of too many elements from list is empty list")

  }

  test("dropWhile") {
    val positive = (x: Int) => x > 0
    assert(dropWhile(Nil, positive) == Nil, "dropWhile of empty list should be empty list")
    assert(dropWhile(List(1), positive) == Nil, "dropWhile of list with single valid element should be empty list")
    assert(dropWhile(List(1, 2, 3, 4), positive) == Nil, "dropWhile of list with only valid elements should be empty list")
    assert(dropWhile(List(1, 2, -3, 4), positive) == List(-3, 4), "dropWhile of list with two leading valid elements should be list without leading elements")
    assert(dropWhile(List(1, -2, -3, 4), positive) == List(-2, -3, 4), "dropWhile of list with one leading valid element should be list without leading element")
    assert(dropWhile(List(-1, -2, -3, 4), positive) == List(-1, -2, -3, 4), "dropWhile of list with no leading valid elements should be same list")
    assert(dropWhile(List(-1, -2, -3, -4), positive) == List(-1, -2, -3, -4), "dropWhile of list with no valid elements should be Nil")
  }

  test("length") {
    assert(length(Nil) == 0, "length of empty list is zero")
    assert(length(List(1)) == 1, "length of single-element list is one")
    assert(length(List(1, 2, 3)) == 3, "length of n-element list is n")
  }

}
