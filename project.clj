(defproject excjava "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot excjava.core
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [commons-logging/commons-logging "1.2"]
                 [com.taoensso/timbre "4.8.0"]
                 [log4j/log4j "1.2.17"]
                 [com.fzakaria/slf4j-timbre "0.3.2"]
                 [org.slf4j/log4j-over-slf4j "1.7.14"]
                 ])
