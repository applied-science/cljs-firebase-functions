(ns cljs-firebase.core
  (:require ["firebase-functions" :as functions]))

(defn handle-request [^js req, ^js res]
  (.send res "Hello, world"))

(def cloud-functions
  #js{:handleRequest (.onRequest functions/https handle-request)})