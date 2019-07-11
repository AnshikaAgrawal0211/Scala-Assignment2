class Sum {

  def addition(f:(Int, Int) => Int, a: Int, b: Int) : Int = f(a, b)
  def squareSum (x: Int, y: Int) = (x*x + y*y)
  def cubeSum(x: Int, y: Int)=(x*x*x + y*y*y)
  def intSum(x: Int, y: Int) =(x + y)
}