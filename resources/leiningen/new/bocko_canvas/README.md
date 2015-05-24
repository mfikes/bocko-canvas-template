# Usage

1. `lein cljsbuild once dev`
2. `script/repl`
3. Point browser to `http://localhost:9000`
4. `(require '[bocko.core :refer [color plot scrn hlin vlin clear *color*]])`

Now you can plot:

```
(color :pink)
(plot 3 3)
```