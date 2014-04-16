(ns ggp-clj-players.legal
  (:import (org.ggp.base.player.gamer.statemachine StateMachineGamer)
           (org.ggp.base.util.statemachine.implementation.prover ProverStateMachine))
  (:gen-class
      :extends org.ggp.base.player.gamer.statemachine.StateMachineGamer
      :name org.ggp.base.player.gamer.clojure.cljLegalPlayer))

; TODO: find a way to return the player's name based on the namee-space above to DRY things out
(def player-name (str "cljLegalPlayer"))

(defn -getName [this]
  player-name)

(defn -getInitialStateMachine [this]
  (ProverStateMachine.))

(defn -stateMachineSelectMove [this timeout]
  (let [state-machine (.getStateMachine this)
        current-state (.getCurrentState this)
        role          (.getRole this)
        legal-move    (seq (.getLegalMoves state-machine current-state role))]
   (first legal-move)))

(defn -stateMachineMetaGame [this timeout]
  (println (str player-name" metagame called")))

(defn -stateMachineAbort [this]
  (println (str player-name" abort called")))

(defn -stateMachineStop [this]
  (println (str player-name" stop called")))
