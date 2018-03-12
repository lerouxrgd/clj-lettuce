(ns celtuce.args.sort
  (:import
   (io.lettuce.core SortArgs)))

(defn sort-args 
  [& {by :by [offset count :as limit] :limit get :get 
      asc :asc desc :desc alpha :alpha}]
  {:pre []}
  (cond-> (SortArgs.)
    by    (.by by)
    limit (.limit offset count)
    get   (.get get)
    asc   (.asc)
    desc  (.desc)
    alpha (.alpha)))

