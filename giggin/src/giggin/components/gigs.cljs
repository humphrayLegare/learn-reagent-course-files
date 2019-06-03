(ns giggin.components.gigs
  (:require [giggin.state :as state]))

(def gigs(fn []
  [:main
  [:div.gigs (map (fn [gig] [:div.gig {:key (get gig :id)}
                              [:img.gig__artwork {:src (get gig :img) :alt (get gig :title)}]
                              [:div.gig__body
                              [:div.gig__title
                              [:div.btn.btn--primary.float--right.tooltip {:data-tooltip "Add to Order"}
                              [:i.icon.icon--plus]] (get gig :title)]
                              [:p.gig__price (get gig :price)]
                              [:p.gig__desc (get gig :desc)]]]) (vals @state/gigs))]]))
