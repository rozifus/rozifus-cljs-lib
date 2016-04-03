(ns {{name}}.core-test
  (:require [cljs.test :refer-macros [deftest testing are is run-tests]]
            [{{name}}.core :refer [hello]]))

(deftest {{name}}-test
  (testing "Pass"
    (is (= "Hello World!" (hello "World")))))





        
