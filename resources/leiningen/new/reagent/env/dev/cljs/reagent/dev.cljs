(ns ^:figwheel-no-load {{project-ns}}.dev
  (:require [{{project-ns}}.core :as core]))

(enable-console-print!)

(core/init!)
