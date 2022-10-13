package Demo

import java.util

class ExtendArray (len: Int) extends NewArray(len){




  def reverse(): Unit ={
    var reversed: Array[Int] = new Array[Int](x.length)
    for (i <- 0 to inserted-1){
      reversed(reversed.length - 1 - i) = x(i)
    }
    x = reversed
  }

}
