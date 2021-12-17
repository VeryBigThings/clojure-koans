(ns problems.22-count)

(defn get-count [n]
  (loop [[head & tail] n acc 0]
    (if-not head
      acc
      (recur tail (inc acc)))))

(= (get-count '(1 2 3 3 1)) 5)

(= (get-count "Hello World") 11)

(= (get-count [[1 2] [3 4] [5 6]]) 3)

(= (get-count '(13)) 1)

(= (get-count '(:a :b :c)) 3)
