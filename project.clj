(defproject reward-system "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :main reward-system.core
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring/ring-defaults "0.3.1"]
                 [ring/ring-json "0.4.0"]
                 [org.clojure/tools.logging "0.4.0"]
  							 [org.clojure/data.json "0.2.6"]]
  :plugins [[lein-ring "0.12.1"]
  					[lein-midje "3.2.1"]]
  :ring {:handler reward-system.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]
												[midje "1.9.0"]]}})

