package example

object Lists {
   def sum(xs: List[Int]): Int = xs match {
      case Nil => 0
      case x :: xs1 => x + sum(xs1)
   }

   def max(xs: List[Int]): Int = xs.max
}
