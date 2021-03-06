(ns spelling-bee.core
  (:require
   [reagent.core :as reagent]
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame :refer [dispatch-sync]]
   [spelling-bee.events]
   [spelling-bee.subs]
   [spelling-bee.views :as views]
   [spelling-bee.config :as config]
   [devtools.core :as devtools]))


(defn dev-setup []
  (devtools/install!)
  (enable-console-print!)
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [views/main-panel] root-el)))

(defn init []
  (dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))

