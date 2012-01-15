(defproject mapnik-clj "0.1.0-SNAPSHOT"
  :description "Clojure wrapper over Mapnik."
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :jvm-opts ["-XX:MaxPermSize=128M" "-Xms1024M" "-Xmx2048M" "-server"]
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :dev-dependencies [[midje "1.3.1"]])
