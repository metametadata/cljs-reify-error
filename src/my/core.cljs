(ns my.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(println "hey!")

(let [v 123
      obj (clojure.core/reify
           Object
           (meth [this x y & z] ;; remove ampersand to make this script work
             [v x y z]))]
  (println (.meth obj 1 2 3)))
