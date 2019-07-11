class Shape {
  def area(shape: String,first:Int,second:Int,f:(Int,Int)): Int ={
    shape match{
      case "Rectangle" => def f(length:Int, breadth:Int): Int ={
        length * breadth
      }
      case "Rhombus" => def f(diago:Int, diagonal:Int): Int ={
        (diago * diagonal) / 2
      }
      case "Parallelogram" =>def f(base:Int, height:Int): Int ={
        base * height
      }
      case _ => println(s"not defined yet for $shape")
    }
  }
}
