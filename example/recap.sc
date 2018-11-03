object main {
    val f: PartialFunction[String, String] = { case  "Ping" => "Pong" }

    f("Ping")
    f.isDefinedAt("Abc")

    val g: PartialFunction[List[Int], String] = {
        case Nil => "one"
        case x :: rest =>
            rest match {
                case Nil => "two"
            }
    }

    g.isDefinedAt(List(1, 2, 3))
}

object collections {
    // Ideal implementation of map collection
    def map[U](f: T => U): List[U] = this match {
        case x :: xs => f(x) :: xs.map(f)
        case Nil => Nil
    }

    // Ideal implementation of flatmap collection
    def flatmap[U](f: T => List[U]): List[U] = this match {
        case x :: xs => f(x) ++ xs.flatmap(f)
        case Nil => Nil
    }

    // Ideal implementation of filter collection
    def filter[U](f: T => Boolean): List[T] = this match {
        case x :: xs =>
            if (p(x)) x :: xs.filter(p) else xs.filter(p)
        case Nil => Nil
    }
      /*
      for(x <- e1) yield e2  ==  e1.map(x => e2)
       */
}


