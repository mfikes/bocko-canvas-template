(ns {{name}}.core
  (:require [clojure.browser.repl :as repl]
            [bocko-canvas.core]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(bocko-canvas.core/init (.getElementById js/document "canvas"))