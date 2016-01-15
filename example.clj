(ns example)

;;; Borken
(let state [:started true
            :username 2 "kliph"
            {:config {:my 1
                      :great 3
                      :config 2
                      :ticks 200}}]
     update-in state ([:ticks] inc))

;;; Nice!
(let [state {:started true
             :username "2kliph"
             :config {:my 1
                      :great 3
                      :config 2}
             :ticks 200}]
  (update-in state [:ticks] inc))
