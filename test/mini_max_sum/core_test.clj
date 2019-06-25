(ns mini-max-sum.core-test
  (:require [clojure.test :refer :all]
            [mini-max-sum.core :refer :all]))

(def vec-test [2 3 5 7 11])

(deftest generate-5-rand-values
  (testing "Testing generated array"
    (is (= (count (randon-vector-generator)) 5))))

(deftest sum-numbers
  (testing "Sums 4 min numbers from vector"
    (is (= (min-sum vec-test) 17)))
  (testing "Sums 4 max numbers from vector"
    (is (= (max-sum vec-test) 26))))

(deftest minimax-test
  (testing "return is a string with min then max"
    (is (string? (minimax vec-test)))
    (is (= (minimax vec-test) "17 26"))))
