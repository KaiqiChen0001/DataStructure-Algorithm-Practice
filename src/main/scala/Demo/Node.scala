package Demo

/*
 indexOf (entry: Int): Int = {
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
  - 1
  }
  }

if(first == null){}
else if(first.ref == null){}
else{
  var previous: Node = null
  var current: Node = first
  var next: Node = first.ref
  while (next.ref != null && current.ref !=null) {
    var next_plus1: Node = next.ref
    next = current.ref

    current.ref = previous
    next.ref = current

    previous = next
    current = next_plus1

  }
  next.ref = current
  last = first
  first = current.ref
}



 */