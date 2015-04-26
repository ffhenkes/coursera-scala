package ffhenkes.coursera.scala.one.week4

// Peano numbers

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {

  def isZero: Boolean = true

  def +(that: Nat): Nat = that

  def -(that: Nat): Nat = if (that.isZero) this else throw new Error("Negative numbers are 'Non Natural'!!")

  def predecessor: Nat = throw new Error("Zero does not have a predecessor!")
}

class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false

  def +(that: Nat): Nat = new Succ(n + that)

  def -(that: Nat): Nat = if (that.isZero) this else n - that.predecessor

  def predecessor: Nat = n
}
