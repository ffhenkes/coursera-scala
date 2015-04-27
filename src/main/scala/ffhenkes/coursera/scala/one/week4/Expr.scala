package ffhenkes.coursera.scala.one.week4

/**
 * Created by fabio on 4/27/15.
 */
trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

