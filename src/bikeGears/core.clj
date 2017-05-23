(ns bikeGears.core
	(:gen-class )

)
(def fgear (seq [32.0 22.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12]))
(for [f fgear r rgear ] (/ f r))  ;; creates unsorted output






(sort (for [f fgear r rgear ] (/ f r))  ) ;;  now a sorted list 22/2/2016

(defn -main [& args]
;;	(println "test string")
	

;
  (println (str   "\n" (sort (for [f fgear r rgear ] (/ f r)))))  ;; creates sorted output  ;; 27/2/2016
;; really want each item in list to be on separate line  
 ;; (printf "%3.3f   "  (sort (for [f fgear r rgear ] (/ f r)))  )
;; possibly use doseq or something to work over the list from 'sort'


(doseq [arg *command-line-args*](def ws1 (set arg))

;; 								(printf "arg='%s'    \n" arg)
(println ws1)
 (println "test2")
 )
 (println "test1")
	)
	;; note arg and not args !!!
  
	
