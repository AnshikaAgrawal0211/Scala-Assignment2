class Shape {
  def area(shape: String,first:Int,second:Int): String ={
    def high(f:(Int,Int)=>Int):Int= {f(first,second)}
      shape match {
        case "Rectangle" => (s"rectangle is ${high((first,second)=>first*second)}")
        case "Rhombus" => (s"rhombus is${high((first,second)=>first*second/2)}")
        case "Parallelogram" => (s"parallelogram is${high((first,second)=>first*second)}")
        case _ => s"not defined yet for $shape"
      }
    }
  }
