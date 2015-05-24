(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "https://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [org.clojure/clojurescript "0.0-3269"]
                 [bocko-canvas "0.1.0"]]
  :plugins [[lein-cljsbuild "1.0.6"]]
  :cljsbuild {:builds {:dev {:source-paths ["src"]
                             :compiler {:main {{name}}.core
                                        :output-to "out/main.js"
                                        :output-dir "out"}}}})