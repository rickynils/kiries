(ns kiries.layout
  (:use hiccup.core)
  (:use hiccup.page))

(defn full-layout [title & content]
  (html5
   [:head
    (include-css "/kibana/css/bootstrap.light.min.css")
    (include-css "/kibana/css/bootstrap-responsive.min.css")
    (include-css "/kibana/css/font-awesome.min.css")
    (include-css "/css/kiries.css")
    [:title title]]
   [:body
    [:div.container-fluid.main
     [:div.row-fluid
      content]]]))
