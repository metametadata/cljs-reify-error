(require 'cljs.closure)

(cljs.closure/watch "src"
  {:output-to "js/out.js"
              :optimizations :simple
              :pretty-print true})
