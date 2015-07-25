# cljs-nodejs-externs

[![Clojars Project](http://clojars.org/io.nervous/cljs-nodejs-externs/latest-version.svg)](http://clojars.org/io.nervous/eulalie)

Adding `cljs-nodejs-externs` as a dependency of a Clojurescript project will allow it to use the Node.js standard library used alongside `:optimizations` `:advanced`.  The standard library modules continue to be imported as usual (i.e. `cljs.nodejs/require`).

There's no original work here - this project is a repackaging of [existing Closure externs for Node.js](https://github.com/dcodeIO/node.js-closure-compiler-externs), with a `deps.cljs` including each file in `:externs`.

# License

[Apache License, Version 2.0][http://www.apache.org/licenses/LICENSE-2.0.html], per [node.js-closure-compiler-externs](https://github.com/dcodeIO/node.js-closure-compiler-externs).