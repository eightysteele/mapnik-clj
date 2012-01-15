(ns mapnik.core
  (:require [mapnik.util :as u]
            [clojure.java.io :as io])
  (:import [mapnik Box2d Mapnik MapDefinition
            Projection Image Renderer]))

(def bounds
  (Box2d. -180 -90 180 90))

(defn generate-png [path]
  (u/with-mem [m     (MapDefinition.)
               image (Image. 512 512)]
    (doto m
      (.loadMap path false)
      (.setSrs Projection/LATLNG_PARAMS)
      (.resize 512 512)
      (.zoomToBox bounds))
    (Renderer/renderAgg m image)
    (.saveToMemory image "png")))

(def example-file
  (str (io/as-file (io/resource "example.xml"))))

(comment
  "Example!"
  (defn dump-example-to-disk
    [output-path]
    (io/copy (generate-png example-file)
             (io/file output-path)))

  (generate-png "/Users/sritchie/Desktop/output.png"))
