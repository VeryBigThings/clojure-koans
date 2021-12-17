(ns problems.28-flatten)

(defn get-flattened [n]
  (loop [[head & tail] n flat []]
    (cond
      (nil? head) flat
      (sequential? head) (recur tail (vec (concat flat (get-flattened head))))
      (char? head) (recur tail (conj flat (str head)))
      :else (recur tail (conj flat head)))))

(= (get-flattened '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (get-flattened ["a" ["b"] "c"]) '("a" "b" "c"))

(= (get-flattened '((((:a))))) '(:a))