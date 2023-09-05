(ns app.actions.browse
  (:require
   [app.actions.entrypoint :as actions]))

(defn c-art-pieces [] [:div "list of art pieces"])

(defmethod actions/get-action ::browse
  []
  {:component c-art-pieces})

(actions/add-primary-action ::browse "See art pieces" {:default? true})