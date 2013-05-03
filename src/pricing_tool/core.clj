(ns pricing-tool.core
  (:require [clojure.java.jdbc :as j]
            [clojure.java.jdbc.sql :as s]
            (use [korma.db])
            (use [korma.core])
  (:gen-class))

  (def config (read-string (slurp "config.supersecret")))

  (defn setup-connection [] (def oracle-db config))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))
