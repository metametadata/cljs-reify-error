(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:output-to "js/out.js"
              :optimizations :simple
              :pretty-print true})
