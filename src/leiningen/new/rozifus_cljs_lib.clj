(ns leiningen.new.rozifus-cljs-lib
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "rozifus-cljs-lib"))

(defn rozifus-cljs-lib [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "src__core.cljs" data)]
      ["test/{{sanitized}}/core_test.cljs" (render "test__core_test.cljs" data)]
      ["test/{{sanitized}}/runner.cljs" (render "test__runner.cljs" data)]
      ["README.md" (render "README.md" data)]
      ["LICENSE" (render "LICENSE" data)]
      [".gitignore" (render "gitignore" data)])))
