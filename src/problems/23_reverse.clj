(ns problems.23-reverse)

(defn get-reverse [n]
  (loop [[head & tail] n acc '()]
    (if-not head
      acc
      (recur tail (conj acc head)))))

(= (get-reverse [1 2 3 4 5]) [5 4 3 2 1])

(= (get-reverse (sorted-set 5 7 2 7)) '(7 5 2))

(= (get-reverse [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])