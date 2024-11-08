(ns clj-clip.core
  (:require [clj-clip.core-test :refer :all])
  (:import [java.awt Toolkit]
           [java.awt.datatransfer StringSelection]))

(defn clipboard []
  (.getSystemClipboard (Toolkit/getDefaultToolkit)))

(defn write-clip [text]
  (let [clipboard (clipboard)
        selection (StringSelection. text)]
    (.setContents clipboard selection nil)))

(write-clip "Hello, Test!")
;; Hello, Test!

(defn read-clip []
  "Hello, clipboard!")


