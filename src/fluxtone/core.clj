(ns fluxtone.core
  (:use [overtone.osc]))

(def PORT 6543)
(def client (osc-client "localhost" PORT))

(osc-send client "/fluxus/zzz" (float 0.2))

(osc-close client)

(comment "Fluxus code"
(define value 0)
(define (test)
  (push)
  (when (osc-msg "/fluxus/zzz")
  (set! value (osc 0)))
  (translate (vector 1 0 value))
  (draw-cube)
  (pop))

  (osc-source "6543")
  (every-frame (test))
)
