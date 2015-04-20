package ffhenkes.coursera.scala.one

/**
 * Created by fabio on 4/20/15.
 */
class Rational(x: Int, y: Int) {
  require(y != 0, "Denominator must be nonzero value!")

  // constructor
  def this(x:Int) =
    this(x, 1)

  private def gcd(a: Int,  b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  val numerator = x / gcd(x, y)
  val denominator = y / gcd(x, y)

  def + (that: Rational) =
    new Rational(
      numerator  * that.denominator + that.numerator * denominator,
      denominator * that.denominator)

  def unary_- : Rational =
    new Rational(-numerator, denominator)

  def - (that: Rational) =
    this + -that

  def < (that:Rational) =
    numerator * that.denominator < that.numerator * denominator

  def max(that:Rational) =
    if (this < (that)) that
    else this

  override def toString = numerator + "/" + denominator
}
