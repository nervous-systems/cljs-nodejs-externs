(defproject io.nervous/cljs-nodejs-externs "0.1.0"
  :description "Packaged externs for the Node.js standard library"
  :url "https://github.com/nervous-systems/cljs-nodejs-externs"
  :license {:name "Apache 2.0" :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :scm {:name "git" :url "https://github.com/nervous-systems/cljs-nodejs-externs"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :signing {:gpg-key "moe@nervous.io"}
  :plugins [[lein-npm "0.5.0"]]
  :profiles {:dev
             {:node-dependencies
              [[nodejs-externs "0.10.1"]]}})
