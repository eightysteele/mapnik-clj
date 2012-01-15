(ns mapnik.test.core
  (:use mapnik.core
        midje.sweet))

(fact "Default test!"
  (boolean "HI!") => true)
