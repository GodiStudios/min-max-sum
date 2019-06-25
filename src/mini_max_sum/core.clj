(ns mini-max-sum.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn randon-vector-generator []
  (let [rand-vec (atom [])]
    (dotimes [x 5] 
      (swap! rand-vec conj (rand-int 100)))
    @rand-vec))

(defn min-sum [rand-vec]
  (->> rand-vec
    (sort)
    (take 4)
    (reduce +)))

(defn max-sum [rand-vec]
  (->> rand-vec
    (sort)
    (reverse)
    (take 4)
    (reduce +)))

(defn minimax [rand-vec]
  (let [min (min-sum rand-vec)
        max (max-sum rand-vec)]
    (str min " " max)))
