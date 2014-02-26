
// isSorted(List(1,2,4,3), (x: Int, y: Int) => y >= x)

def isSorted[A](l: List[A], cmp: (A, A) => Boolean): Boolean = {
  def go(i: Int, status: Boolean): Boolean = {
    if ( !status ) false
    else if ( i >= l.length - 1 ) true
    else go(i+1, cmp(l(i), l(i+1)))
  }

  go(0, true)
}
