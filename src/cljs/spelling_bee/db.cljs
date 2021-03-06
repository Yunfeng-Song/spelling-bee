(ns spelling-bee.db)

(def default-db
  {:game-status {:value ""
                 :word-list []
                 :current-score 0
                 :popup false
                 :message ""}
   :game-data {:chars {:main "R" :rest ["A" "B" "F" "O" "P" "Y"]}
               :answers ["babyproof" "afar" "affray" "afro" "arbor" "array" "arroy" "barb" "barf" "boar" "boor" "bray" "farro" "fora" "foray" "fray" "parry" "poor" "pray" "proof" "prop" "pyro" "roar" "roof" "ropy"]
               :rankings (into (sorted-map) {0 "Beginner" 2 "Good Start" 5 "Moving Up" 8 "Good" 16 "Solid" 27 "Nice" 42 "Great" 53 "Amazing" 74 "Genius"})}})
