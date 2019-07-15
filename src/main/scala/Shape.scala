class Shape {
  def area(shape: String,first:Int,second:Int,f:(Int,Int)=>Int): String ={
   shape match{
        case "Rectangle" => s"area of rectangle is ${ f(first,second)}"
        case "Rhombus" => s"area of rhombus is${ f(first,second)}"
        case "Parallelogram" => s"area of parallelogram is${f(first,second)}"
        case _ => s"not defined yet for $shape"
      }
    }
  }
