(ns shaneclj.core)

(defn cmd
  ""
  [& args]
  ;; map a vector with a shell command
  (clojure.string/join
   " "
   (map (fn [s] (->
                 (sh "q" :in s)
                 :out)) args)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
