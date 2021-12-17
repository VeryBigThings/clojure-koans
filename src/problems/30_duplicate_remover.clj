(ns problems.30-duplicate-remover)

(defn consecutive-duplicates-remover [n]
  (loop [[head & tail] n acc []]
    (cond
      (nil? head) acc
      (= head (first tail)) (recur tail acc)
      :else (recur tail (conj acc head)))))

(= (apply str (consecutive-duplicates-remover "Leeeeeerrroyyy")) "Leroy")

(= (consecutive-duplicates-remover [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (consecutive-duplicates-remover [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))