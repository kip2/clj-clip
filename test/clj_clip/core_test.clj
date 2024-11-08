(ns clj-clip.core-test
  (:require [clojure.test :refer :all]
            [clj-clip.core :refer :all]))

(deftest clipboard-test
  (testing "クリップボードへのデータ保存と取得"
    (let [data "Hello, clipboard!"]
      (write-clip data)

      (is (= data (read-clip))))))

