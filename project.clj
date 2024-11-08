(defproject clj-clip "0.1.0-SNAPSHOT"
  :description "A simple library for handling the clipboard within the Clojure REPL."
  :url "https://github.com/kip2/clj-clip"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns clj-clip.core})
