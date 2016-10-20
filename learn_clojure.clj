(ns learn_clojure)

(type 1)

(type 1.1)

(type true)

(type "Hello")


(type :a)

(type (quote a))
(type 'a)

(type '(1 3 5))

(type [1 2 3])

(nth (vector 1 2 3) 2) ;faster with nth to use vectors

(first `(1 2 3)) ;faster to use first/last with lists

(type {:a 1 :b 2 :c 3})

(type #{1 2 3 4})

;constructors

(list 1 2 3)
(vector 1 2 3)
(hash-map :a 1 :b 2 :c 3)
(hash-set 1 2 3)

; control flow

(def x "Hello Clojure")

(let [x "Steve"]
  (print "Hello, " x))

(print x)
