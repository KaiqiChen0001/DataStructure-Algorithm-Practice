package Demo
import java.util
import java.util.Stack
class StringReverser {
  def reverse(input: String): String = {
    if(input ==null) throw new IllegalArgumentException()
    else{
    val x: Stack[Char] = new Stack()
    val reversed: StringBuffer = new StringBuffer()
    for (letter <- input) {
      x.push(letter)
    }
    for (i <- 0 to input.length - 1) {
      reversed.append(x.pop())
    }
    reversed.toString
  }
  }

  def BalancedExpression(input: String): Boolean = {
    val container: Stack[String] = new Stack()
    val leftbracket: Array[String] = Array("<", "[", "(")
    val rightbracket: Array[String] = Array(">", "]", ")")
    val amap: Map[String, String] = Map(
      ">" -> "<",
      "]" -> "[",
    ")" -> "("
    )
    for(letter <- input){
      val char = letter.toString
      if (leftbracket contains char) container.push(char)
      if(rightbracket contains char){
        if(container.empty()) return false
        else if(container.peek() == amap(char)) {container.pop()}
        else {return false}
      }
    }

if(container.empty()) true
else false

  }
}
