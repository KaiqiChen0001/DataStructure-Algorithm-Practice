package Demo

import com.sun.jdi.request.InvalidRequestStateException
import java.util.Arrays
class NewStack {
  var storage: Array[Int] = new Array(16)
  var count: Int = 0

  def push(item: Int): Unit ={
    if(count == storage.length)
    {
      val replace: Array[Int] = new Array(2 * storage.length)
      for(i <- 0 to storage.length-1){replace(i)=storage(i)}
      storage = replace
    }
    storage(count) = item
    count += 1
  }

  def pop(item: Int): Unit = {
    if(count == 0) throw new IllegalStateException()
    storage(count-1) = 0
    count -= 1
  }

  def isEmpty(): Boolean = {
  count == 0
  }
  def peek():Int={
    if (isEmpty()) throw new IllegalStateException()
    else{storage(count-1)}
  }

  override def toString: String = {
    val lst: List[Int] = storage.toList
    val content = Arrays.copyOfRange(storage, 0, count);
    Arrays.toString(content);

  }

}
