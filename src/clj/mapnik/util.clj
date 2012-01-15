(ns mapnik.util
  (:import [mapnik Mapnik]))

(defmacro with-mem
  "bindings => [name init ...]

  Evaluates body in a try expression with names bound to the values
  of the inits, and a finally clause that calls (.close name) on each
  name in reverse order."
  [bindings & body]
  {:pre [(vector? bindings)
         (even? (count bindings))]}
  (Mapnik/initialize)
  (let [[sym val] bindings]
    (cond
     (empty? bindings) `(do ~@body)
     (symbol? sym)     `(let [~sym ~val]
                          (try 
                            (with-mem ~(subvec bindings 2) ~@body)
                            (finally
                             (.dispose ~sym))))
     :else (throw (IllegalArgumentException.
                   "with-open only allows Symbols in bindings")))))
