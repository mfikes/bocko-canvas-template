(ns leiningen.new.bocko-canvas
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
    [leiningen.core.main :as main]))

(def render (renderer "bocko-canvas"))

(defn bocko-canvas
  "FIXME: write documentation"
  [name]
  (let [data {:name      name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' bocko-canvas project.")
    (->files data
      ["README.md" (render "README.md" data)]
      ["project.clj" (render "project.clj" data)]
      ["index.html" (render "index.html" data)]
      ["script/repl" (render "repl" data) :executable true]
      ["script/repl.bat" (render "repl.bat" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)])))