(ns requests
  (:require [hato.client :as c]))

(defn do-request 
  []
  (c/get "https://pokeapi.co/api/v2/pokemon/ditto" {:async? true}))


(comment
  @(do-request)
  )
