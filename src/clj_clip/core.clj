(ns clj-clip.core
  (:import [java.awt Toolkit]
           [java.awt.datatransfer StringSelection DataFlavor UnsupportedFlavorException]))

(defn- clipboard []
  (.getSystemClipboard (Toolkit/getDefaultToolkit)))

(defn write-clip [text]
  (let [selection (StringSelection. text)]
    (.setContents (clipboard) selection nil)))


(defn read-clip []
  (let [contents (.getContents (clipboard) nil)]
    (try
      (if (.isDataFlavorSupported contents DataFlavor/stringFlavor)
        (.getTransferData contents DataFlavor/stringFlavor)
        (println "String data not available in clipboard"))
      (catch UnsupportedFlavorException e
        (println "Unsupported flavor error" (.getMessage e)))
      (catch java.io.IOException e
        (println "I/O error" (.getMessage e))))))



