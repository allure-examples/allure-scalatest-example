package ru.yandex.qatools.allure.scalatest

import org.scalatest._
import scala.collection.mutable
import ru.yandex.qatools.allure.annotations.{Features, Title}

@Title("This is a stack specification")
@Features(Array("Simple stack"))
class StackSpec extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new mutable.Stack[String]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
  }
}