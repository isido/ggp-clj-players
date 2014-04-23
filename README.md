
# ggp-clj-players

A Clojure libary which leverages the excellent ggp-base Java library
open sourced by Sam Schreiber for general game playing
(https://github.com/ggp-org/ggp-base)

This is forked (and only slightly modified) version of Sébastien
Arnaud's library. Main changes are to the player invocation (play.sh
wasn't working on the original library) and an adding of another
example player. 

There are two example players, which are defined in files
´´src/ggp-clj-players/{legal.clj,random.clj}´´. If you add another
player, you need to modify ``project.clj`` file as well.

I will probably not add other players in order not to spoil the fun
from Coursera General Game Playing class [1], but will probably update
the infrastructure to reflect more framework presented in the lecture
notes [2].

## Usage
```
git submodule init
git submodule update
lein sub install
lein do deps, compile
lein kiosk
```

Then pick any of the sample games available in the Kiosk and pick the
cljRandomPlayer to test it out. The other sample players listed come
from the Java library itself.

You can also fire the player of your choice for remote game playing
via ``lein launch``

## License

The code is licensed under MIT license.

Copyright © 2014 Sébastien Arnaud
Copyright © 2014 Ilja Sidoroff

[1] https://class.coursera.org/ggp-002
[2] http://arrogant.stanford.edu/ggp/chapters/chapter_04.html
