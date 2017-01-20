(ns excjava.core
  (:require
    [taoensso.timbre :as log])
  (:import Boom
    ))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main
  []
  (foo 42)
  (log/info "info from clojure")
  (try
    (Boom/yo "foo")
    (catch Exception e (log/error e "got error in clojure code"))
    )
  )
