(ns debug-atom-boom
  "Evaluating the instrumented `boom` function and then the (boom)` expression should place you in the debugger. And eventually evaluate to 0. Instead an error happens.")

(def !a (atom 0))

#dbg
(defn boom
  []
  @!a)

(comment
  (boom)
  )
