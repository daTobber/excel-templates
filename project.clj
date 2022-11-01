(defproject com.infolace/excel-templates "0.3.3"
  :description "Build Excel files by combining a template with plain old data"
  :url "https://github.com/tomfaulhaber/excel-templates"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.apache.commons/commons-lang3 "3.12.0"]
                 [org.apache.poi/poi-ooxml-full "5.2.3"] 
                 [org.clojure/data.zip "1.0.0"]
                 [joda-time "2.12.0"]]
  :profiles {:repl {:dependencies [[org.clojure/clojure "1.10.3"]]}})
