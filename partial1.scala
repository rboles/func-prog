
// A function that takes a value and a function of 2 arguments
// it returns a function of 1 argument as a result
def partial1[A,B,C](a: A, f: (A, B) => C): B => C = {

  def g(b: B): C = f(a, b)

  g
}

// or more succinctly

def p1[A, B, C](a: A, f: (A, B) => C): B => C = {
  (b: B) => f(a, b)
}

// concrete usage

val g = partial1("f", (a: String, b: Boolean) => { if ( a == "f" ) true else false })
