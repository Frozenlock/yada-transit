;; Copyright © 2014-2017, JUXT LTD.

(def VERSION "1.2.16")

(defproject org.clojars.frozenlock/yada-transit VERSION
  :description "Support for transit media-types -- Fork with metadata support"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :pedantic? :abort
  :dependencies [[yada/core ~VERSION]
                 [com.cognitect/transit-clj "0.8.313"]])
