#!/bin/bash

PORT=${2:-9147}
PLAYER=${1:-cljRandomPlayer}

java -cp target/ggp-clj-players-0.1.1-standalone.jar org.ggp.base.apps.player.PlayerRunner $PORT $PLAYER
