package Demo
import java.util.Stack



object Data1 {


  def main(args:Array[String]): Unit ={
    val x: StringReverser = new StringReverser()
    println(x.BalancedExpression("[(())]"))

    val y: NewStack = new NewStack()
    y.push(10)
    y.push(20)
    y.push(30)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(40)
    y.push(50)
    println(y.isEmpty())
    println(y.peek())
    println(y)




   }
 }

