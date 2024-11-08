(ns clj-clip.core
  (:import [java.awt Toolkit]
           [java.awt.datatransfer StringSelection DataFlavor UnsupportedFlavorException]))

(defn clipboard []
  (.getSystemClipboard (Toolkit/getDefaultToolkit)))

(defn write-clip [text]
  (let [clipboard (clipboard)
        selection (StringSelection. text)]
    (.setContents clipboard selection nil)))


(defn read-clip []
  (let [clipboard (clipboard)
        contents (.getContents clipboard nil)]
    (try
      (when (.isDataFlavorSupported contents DataFlavor/stringFlavor)
        (.getTransferData contents DataFlavor/stringFlavor))
      (catch UnsupportedFlavorException e
        (.printStackTrace e))
      (catch java.io.IOException e
        (.printStackTrace e)))))



