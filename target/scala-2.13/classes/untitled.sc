def add(a:Int) : Int = a

println(add(2))

val sub : (Int) => Int = (a:Int) => a

println(sub(5))

val a : Int = 98

def mul (a:Int, b:Int, function: (Int) => Int): Unit = {

  println(function(56))

}

mul(3,5,(a:Int) => a)
mul(3,4,add)