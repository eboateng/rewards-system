(ns reward-system.adapter
	(:require [clojure.java.io :as io]
						[clojure.string :as str]
            [reward-system.logic :as logic]))

(defn format-response  [function string-seq]
	(let [numbers (-> string-seq
										(str)
										(str/split #" "))]
		(function (first numbers) (second numbers))))

(defn read-file [file-path function]
	(with-open [reader (io/reader file-path)]
  	(doall (map #(format-response function %) (line-seq reader)))))

(defn bfs [graph start-point]
  (reduce + (logic/aux-bfs graph (hash-map start-point 0) #{start-point} (conj (clojure.lang.PersistentQueue/EMPTY) start-point))))