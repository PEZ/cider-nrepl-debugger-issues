(ns atoms
  "Debugging this function fails throwing the following message:
      An error occurred in the breakpoint-finding logic. 
      We would love if you submitted an issue in the Calva 
      repo with the instrumented code, or a similar reproducible case.
   I tried this in WSL and in Gitpod Workspace-Full Docker container")

(defn counter
  [top]
  (let [cnt (atom 0)]
    (dotimes [_ top]
      (swap! cnt inc)
      (println @cnt))))
 
(comment 
   
  (counter 10)

  )
