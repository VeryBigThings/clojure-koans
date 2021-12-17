(ns problems.19-get-last
  (:require [koan-engine.core :refer :all]))

(defn get-last [n]
  (loop [[head & tail] n acc nil]
    (if-not head
      acc
      (recur tail head))))

(= (get-last [1 2 3 4 5]) 5)
(= (get-last '(5 4 3)) 3)
(= (get-last ["b" "c" "d"]) "d")
