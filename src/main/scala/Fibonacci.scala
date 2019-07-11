import scala.annotation.tailrec

class Fibonacci {
  def fibo(number:Int): Unit = {
    @tailrec
    def series(num:Int=0): Unit= {
      num match{
      case 0 => print(0+" ")
      case 1 => print(1)
      case _ => print( " "+cal(num) )
      }
      if(num<number) series(num+1)
    }
    @tailrec
    def cal(currentIndex : Int, prev : Int = 0, next : Int = 1) : Int =
    {
      currentIndex match {
        case 0 => prev
        case 1 => next
        case _ => cal(currentIndex -1, next, prev + next)
      }
    }
    (series())
    }
  }
