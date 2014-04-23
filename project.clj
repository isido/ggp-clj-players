(defproject ggp-clj-players "0.1.1"
  :description "Clojure library to develop GGP players"
  :url "http://E"
  :license {:name "MIT license"
            :url "http://opensource.org/licenses/MIT"}
  :min-lein-version "2.0.0"
  :plugins [[lein-sub "0.3.0"]]
  :source-paths ["src"]
  :sub ["vendor/ggp-base"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ggp-base "0.1.1"]]
  :profiles {:uberjar {:aot [ggp-clj-players.random ggp-clj-players.legal]}}
  :aliases {"kiosk" ["do" "clean" ["uberjar"] ["run" "-m" "ggp-clj-players.core/kiosk"]]}
  )
