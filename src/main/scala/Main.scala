object Main extends App {


 println("1: fibonacci series")
 println("2: area of shape")
 println("3: sum ")

 val choice = scala.io.StdIn.readInt()
 choice match {
  case 1 =>
 val fibonacci = new Fibonacci
 fibonacci.fibo (5)
  case 2=>
 val shape = new Shape
 val functionRectangle = (first: Int, second: Int) => first * second
 val functionRhombus = (first: Int, second: Int) => first * second / 2
 val functionParallelogram = (first: Int, second: Int) => first * second
 println (shape.area ("Rectangle", 5, 6, functionRectangle) )
case 3=>
 val add = new Sum
 val squareSum = (a: Int, b: Int) => (a * a) + (b * b)
 val cubeSum = (a: Int, b: Int) => (a * a * a) + (b * b * b)
 val intSum = (a: Int, b: Int) => a + b
 println (add.sum (cubeSum, 5, 4) )

 }
}