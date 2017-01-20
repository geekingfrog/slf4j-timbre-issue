(ns excjava.core
  (:require
    [taoensso.timbre :as log])
  (:import Boom
    ))

(defn -main
  []
  (try
    (Boom/boom)
    (catch Exception e (log/error e "got error in clojure code"))
    )
  )
