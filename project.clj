(defproject josuecaraballo.com-host "0.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-jetty-adapter "1.6.3"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler josuecaraballo.com-host.handler/app}
  :main josuecaraballo.com-host.handler
  :profiles {:dev {:dependencies
                   [[javax.servlet/servlet-api "2.5"]
                   [ring/ring-mock "0.3.2"]]}
             :uberjar {:aot :all}})
