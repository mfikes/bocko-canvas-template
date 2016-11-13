(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "https://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [bocko-canvas "1.0.0"]]
  :plugins [[lein-cljsbuild "1.1.4"]]
  :cljsbuild {:builds {:dev {:source-paths ["src"]
                             :compiler {:main {{name}}.core
                                        :output-to "out/main.js"
                                        :output-dir "out"}}}})
