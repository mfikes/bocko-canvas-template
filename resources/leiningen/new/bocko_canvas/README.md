# Usage

1. `lein cljsbuild once dev`
2. `script/repl` or `script\repl.bat`
3. Point browser to `http://localhost:9000`
4. Then in the REPL `(require '[bocko.core :refer [color plot scrn hlin vlin clear *color*]])`


Now you can plot:
```clojure
(plot 2 3)      ;; plots a point on the screen

(color :pink)   ;; changes the color to pink
(plot 5 5)

(scrn 5 5)      ;; => :pink

(hlin 3 9 10)   ;; draws a horizontal line

(clear)         ;; clears screen
```

The commands comprise `color`, `plot`, `scrn`, `hlin`, `vlin`, and `clear`.

To get the documentation for a command, type, for example, `(doc color)` in the REPL.
