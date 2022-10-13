package Demo

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



}
