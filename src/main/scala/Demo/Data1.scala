package Demo




object Data1 {


  def main(args:Array[String]): Unit ={
    var x: LinkedList = new LinkedList()
    x.addlast(10)
    x.addlast(10)
    x.addlast(10)
    println(x.Size())
    x.deleteLast()
    x.deleteLast()
    x.deleteLast()
    println(x.Size())

    x.addlast(20)
    x.addlast(30)
    x.addlast(40)
    //x.addlast(50)
    //x.reverse()
    x.toreverse()
    val b: Array[Int] = x.toArray()
    println(b.toList)


    println(x)





   }
 }

