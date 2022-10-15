package Demo

import javax.management.openmbean.InvalidKeyException
import scala.util.control.Breaks.break

class Node(val value: Int) {
  var ref: Node = null
}


class LinkedList {
  var first: Node = null
  var last: Node = null
  private var size: Int = 0


  def addfirst(entry: Int): Unit ={
    var item: Node = new Node(entry)
    if (first == null) {
      first = item
      last = item
    }
    else{
      item.ref = first
      first = item
    }
    this.size +=1
  }

  def addlast(entry: Int): Unit ={
    var item: Node = new Node(entry)
    if (first == null){
      first = item
      last = item
    }
    else{
      this.last.ref = item
      this.last = item
    }
    this.size+=1
  }

  def indexOf(entry: Int): Int = {
    var index: Int = 0
    var find: Boolean = false
    var current: Node = first
    while (current.ref != null & current.value != entry) {
      index += 1
      current = current.ref
    }
    if (current.value == entry) find = true

    if (find) {
      index
    }
    else {
      -1
    }
  }

  def deleteFirst(): Unit ={
    if(first == null) throw new NoSuchElementException()
    else if(first != null && first.ref == null) {first = null ; last = null}
    else {
      val a: Node = first
      first = first.ref
      a.ref = null
    }
    size-=1
    }
  def deleteLast(): Unit ={
    if(first == null) throw new NoSuchElementException()
    if(first != null && first.ref == null) {first = null ; last = null}
    else {
      var current: Node = first
      while (current.ref != last) {
        current = current.ref
      }
      current.ref = null
      last = current
    }
    size-=1
  }

  def contains(entry: Int): Boolean ={
    var find: Boolean = false
    var current: Node = first
    while(current.ref != null & current.value != entry) {
      current = current.ref
    }
    if(current.value == entry) find = true
    find
  }

  def Size(): Int = {
    size
  }

  def toArray(): Array[Int] = {
    val arr: Array[Int] = new Array(this.Size())
    if(this.first == null) arr

    else{
      var index: Int = 0
      var current: Node = first
      while (current.ref != null) {
        arr(index) = current.value
        index += 1
        current = current.ref
      }
      arr(index) = current.value
      arr
    }
  }

  def reverse(): Unit = {
    if (first == null) {}
    else if (first.ref == null) {}
    else {
      val nodeArray: Array[Node] = new Array(this.Size())
      var current: Node = first
      var index: Int = 0
      while (current.ref != null) {
        nodeArray(index) = current
        index += 1
        current = current.ref
      }
      nodeArray(index) = current

      val reverseArr: Array[Node] = new Array(this.Size())
      for (index <- 0 to nodeArray.length - 1) {
        reverseArr(index) = nodeArray(nodeArray.length - 1 - index)
      }
      first = reverseArr(0)
      last = reverseArr(reverseArr.length - 1)
      last.ref = null
      for (index <- 0 to reverseArr.length - 2) {
        reverseArr(index).ref = reverseArr(index + 1)
      }
    }
  }
  def toreverse(): Unit ={
    if(first == null){}
    else if(first.ref == null){}
    else{
      var current: Node = first
      var next: Node = first.ref
      var previous: Node = null
      while(current.ref != null){
        next = current.ref
        current.ref = previous
        previous = current
        current = next
      }
      current.ref = previous
      last = first
      first = current

    }
  }

  def getKthFromTheEnd(k: Int): Int = {
    if(first==null){throw new IllegalStateException()}
    else
    {
      if (!(k >= 1)) throw new IllegalArgumentException()
    else if (k == 1) last.value

    else {
      var fpointer: Node = first
      var spointer: Node = first
      val distance: Int = k - 1

      for (i <- 1 to distance) {
        if (fpointer.ref != null) {
          fpointer = fpointer.ref
        }
        else {
          throw new IllegalArgumentException()
        }
      }

      while (fpointer.ref != null) {
        fpointer = fpointer.ref
        spointer = spointer.ref
      }
      spointer.value
    }
  }
  }

def printMiddle(): Unit ={
  if(first==null){throw new IllegalStateException()}
  else{
  var a: Node = first
  var b: Node =first
  //var length: Int = 1
  while(a.ref!=last && a!=last){
    //length += 1
    a = a.ref
    a = a.ref
      //length += 1
      b = b.ref
    }
  if(a.ref == last) {println(b.value.toString+","+b.ref.value.toString)}
  else {println(b.value.toString)}
}
}

  def hasloop(): Boolean = {
    var answer: Boolean = false
    if(first==null) answer
    else{
      var fast: Node = first
      var slow: Node = first
    while (fast.ref != null) {
      fast = fast.ref
      if (fast.ref != null) {
        fast = fast.ref
        slow = slow.ref
        if (slow == fast) {
          answer = true
          return answer}
      }
    }
    answer
  }
  }












}
