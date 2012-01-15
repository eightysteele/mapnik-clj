# What is the mapnik-clj project?

The mapnik-clj project is a [Clojure](https://github.com/clojure/clojure) wrapper for [Mapnik](https://github.com/mapnik/mapnik), an API for building beautiful maps.

# Let's get started

As a starting point we'll want to look at the [mapnik-jni](https://github.com/SpatialInteractive/mapnik-jni) project for Java bindings to Mapnik.

## Install Mapnik & Friends

Mapnik-clj wraps the Mapnik C++ API. To use Mapnik-clj you'll need a local installation of Mapnik.

### OS X

On OS X Lion, install Mapnik with [homebrew](http://mxcl.github.com/homebrew/):

```bash
brew update
sudo chown -R $USER /Library/Python
brew install --use-clang  mapnik
```

If cairomm fails, you may need to install it with Macports before proceeding:

```bash
sudo port install cairomm
```

If you're still stuck, another option is this [Homebrew recipe](http://trac.mapnik.org/wiki/MacInstallation/Homebrew).

### Ubuntu 

To install Mapnik on Ubuntu, fire up your command line and type: 

```bash
sudo apt-get install build-essential curl wget python-software-properties
sudo add-apt-repository ppa:mapnik/nightly-trunk
sudo apt-get update
sudo apt-get install libmapnik libmapnik-dev mapnik-utils
```

## Mapnik-JNI

Building Mapnik-JNI requires [Ant](http://ant.apache.org), a Java build tool and [cairomm](http://cairographics.org/cairomm), a C++ wrapper for the cairo graphics library. 

On Ubuntu you can install Ant and cairomm like this:

```bash
sudo apt-get install ant1.7 ant-optional libcairomm-1.0-1 libcairomm-1.0-dev
```

After that, you can build Mapnik-JNI like this:

```bash
git clone https://github.com/SpatialInteractive/mapnik-jni.git`
cd mapnik-jni
ant test
```

## Native Binding Installation


