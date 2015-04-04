
// is this awesome or not?

object higher {

//  def sum(f: Int => Int):(Int, Int) => Int = {
//    def sumF(a:Int, b:Int):Int =
//      if (a > b) 0
//      else f(a) + sumF(a + 1, b)
//    sumF
//  }

  def sum(f: Int => Int)(a:Int, b:Int):Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  sum(x => x * x * x)(2, 3)
}