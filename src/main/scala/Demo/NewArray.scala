package Demo

class NewArray(length: Int) {
  var x:Array[Int] = new Array[Int](length)
  var inserted: Int = 0

  def reverseit: Unit ={

  }





  def print(): Unit ={
    if (this.inserted > 0){
      for (index <- 0 to this.inserted - 1){
        println(this.x(index))
      }
    }
  }

  def indexOf(target: Int): Int = {
    //var hello: Array[Int] = x.sorted
    var answer: List[Int] = List()
    for (index <- 0 to inserted - 1) {
      if (target == x(index)) {
        answer = answer :+ index
      }
    }
    if(answer.length == 0){
      -1
    }
    else{
      answer(0)
    }
  }


  def removeAt(index: Int): Unit ={
    if(0<= index && (index <= inserted-1)) {
      if(index == x.length-1){
      inserted += -1
    }
    else{
      var adjusted: Array[Int] = x
      for (i <- index to inserted -2) {
      adjusted(i) = x(i+1)
      }
      inserted += -1
    }
    }
    else{
      throw new IllegalArgumentException()
    }
  }

  def insert(add: Int): Unit ={
    if(inserted == x.length){
      var extended: Array[Int] = new Array[Int](x.length + 1)
      for (index <- 0 to (x.length-1)){
        extended(index) = x(index)
      }
      x = extended
     x(inserted) = add
     inserted += 1
    }
    else{
      this.x(inserted) = add
      inserted += 1
    }
  }


}
