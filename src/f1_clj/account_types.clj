(ns f1-clj.account-types
  (:require [clj-http.client :as client]
            [f1-clj.utils.http :refer [api-action]]))

(defn list-types
  "Returns a list of account types."
  []
  (api-action :GET "/giving/v1/accounts/accounttypes" {:accept :xml}))

(defn show-type
  "Returns a single account type for the given id."
  [id]
  (let [path (str "/giving/v1/accounts/accounttypes/" id)]
    (api-action :GET path {:accept :xml})))