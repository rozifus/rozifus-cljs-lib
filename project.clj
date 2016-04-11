(defproject rozifus-cljs-lib/lein-template "0.1.1"
  :description "A cljs lib template with doo testing"
  :url "https://github.com/rozifus/rozifus-cljs-lib"
  :scm {:name "git"
        :url "https://github.com/rozifus/rozifus-cljs-lib"}
  :signing {:gpg-key "rozifus@gmail.com"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true)
