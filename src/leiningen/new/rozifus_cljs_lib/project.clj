(defproject {{name}} "0.0.1-SNAPSHOT"
  :description "FIXME: write this!"
  :url "https://examples.com/FIXME"

  :source-paths ["src" "test"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.34"]]
  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-npm "0.6.1"]
            [lein-doo "0.1.6"]]
  :cljsbuild {
    :builds { 
        :test {
          :source-paths ["src" "test"]
          :compiler {
            :main '{{name}}.runner
            :optimizations :none
            :output-to "target/cljs/unit-test.js" }}}})
