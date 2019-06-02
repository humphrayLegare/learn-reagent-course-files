(ns giggin.core
  (:require
    [reagent.core :as r]
    [giggin.components.header :refer [header]]
    [giggin.components.gigs :refer [gigs]]
    [giggin.components.orders :refer [orders]]
    [giggin.components.footer :refer [footer]]
    ))

(defn app
  []
  [:div.container
  [header]
  [gigs]
  [orders]
  [footer]])

; (def app (fn []
;   [:div {:class "container" :id "main"}]))

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))

; (def component (fn (x)[:div.container]))
; (defn [][:div])
