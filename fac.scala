
def factorial(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, acc: Int): Int =
    if ( n <= 0 ) acc
    else go(n-1, n*acc)

  go(n, 1)
}

def formatResult(name: String, n: Int, f: Int => Int) = {
  val msg = "The %s of %d is %d."
  msg.format(name, f(n))
}
