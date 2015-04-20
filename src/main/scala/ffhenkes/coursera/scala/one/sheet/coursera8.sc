//import ffhenkes.coursera.scala.one.Rational // import specific
//import ffhenkes.coursera.scala.one.{Rational, .., N} // import many
//import ffhenkes.coursera.scala.one._ // import all stuff in package

object scratch {
  // fully qualified
  // new ffhenkes.coursera.scala.one.Rational(1, 2)

  //new Rational(1, 2)

  // exceptions
  def error(msg: String) = throw new Error(msg)

  // null subtype of AnyRef cant use with AnyVal
  val a = null
  val y: String = a

  if (true) 1 else false // AnyVal



}