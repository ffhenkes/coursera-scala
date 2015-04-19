
// rationals

object rationals {
  val x = new Rational(1, 2)

  val y = new Rational(2, 3)
  x.add(y)

  val z = new Rational(5, 7)
  x.sub(y).sub(z)


}

class Rational(x: Int, y: Int) {
  def numerator = x
  def denominator = y

  def add(that: Rational) =
    new Rational(
      numerator  * that.denominator + that.numerator * denominator,
      denominator * that.denominator)

  def neg: Rational =
    new Rational(-numerator, denominator)

  def sub(that: Rational) =
    add(that.neg)

  override def toString = numerator + "/" + denominator
}