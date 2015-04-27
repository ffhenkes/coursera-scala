import ffhenkes.coursera.scala.one.week4._

// Pattern matching

object exprs {

  def show(e: Expr): String = e match {
    case Number(n) => n.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }

  show(Sum(Number(1), Number(2)))

}