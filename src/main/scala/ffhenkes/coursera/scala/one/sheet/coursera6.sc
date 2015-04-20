
// rationals

object rationals {
  val x = new Rational(1, 2)

//  val y = new Rational(2, 3)
//  x.add(y)
//
//  val z = new Rational(5, 7)
//  x.sub(y).sub(z)

  val y = new Rational(2, 3)
  x + y

  val z = new Rational(5, 7)
  x - y - z

//
//  x.less(y)

  x < y
  x max y
}

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
//
//  def add(that: Rational) =
//    new Rational(
//      numerator  * that.denominator + that.numerator * denominator,
//      denominator * that.denominator)
//
//  def neg: Rational =
//    new Rational(-numerator, denominator)
//
//  def sub(that: Rational) =
//    add(that.neg)

//  def less(that:Rational) =
//      numerator * that.denominator < that.numerator * denominator

  // crazy identifiers!! awesome!!

  def + (that: Rational) =
    new Rational(
      numerator  * that.denominator + that.numerator * denominator,
      denominator * that.denominator)

//  def neg: Rational =
//    new Rational(-numerator, denominator)
//
//  def - (that: Rational) =
//    this + that.neg

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