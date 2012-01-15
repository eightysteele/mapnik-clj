# What is the mapnik-clj project?

The mapnik-clj project is a [Clojure](https://github.com/clojure/clojure) wrapper for [Mapnik](https://github.com/mapnik/mapnik), an API for building beautiful maps.

# Let's get started

As a starting point we'll want to look at the [mapnik-jni](https://github.com/SpatialInteractive/mapnik-jni) project for Java bindings to Mapnik.

## Install Mapnik & Friends

For OS X Lion, install with [homebrew](http://mxcl.github.com/homebrew/):

```bash
brew update
brew install mapnik
```

If either of these fail on OS X Lion with this error -- `configure: error: C compiler cannot create executables` -- run the dependency installation again with the `--use-clang` option:

```bash
brew install --use-clang mapnik
```

(I actually had to install `cairomm` with MacPorts, ie `sudo port install cairomm`, due to this error:

```bash
checking for CAIROMM... configure: error: Package requirements (cairo >= 1.8.0 sigc++-2.0) were not met:

No package 'cairo' found
No package 'sigc++-2.0' found

Consider adjusting the PKG_CONFIG_PATH environment variable if you
installed software in a non-standard prefix.

Alternatively, you may set the environment variables CAIROMM_CFLAGS
and CAIROMM_LIBS to avoid the need to call pkg-config.
See the pkg-config man page for more details.
```

If you're still stuck, another option is this [Homebrew recipe](http: //trac.mapnik.org/wiki/MacInstallation/Homebrew).

To install it on Ubuntu, fire up your command line and type: 

```bash
sudo apt-get install build-essential curl wget python-software-properties
sudo add-apt-repository ppa:mapnik/nightly-trunk
sudo apt-get update
sudo apt-get install libmapnik libmapnik-dev mapnik-utils
```

## Mapnik-JNI

Building Mapnik-JNI requires [Ant](http://ant.apache.org), a Java build tool and [cairomm](http://cairographics.org/cairomm), is a C++ wrapper for the cairo graphics library. 

On Ubuntu you can install Ant and cairomm like this:

```bash
sudo apt-get install ant1.7 ant-optional libcairomm-1.0-1 libcairomm-1.0-dev
```

With Ant installed, you can build Mapnik-JNI like this:


```bash
git clone https://github.com/SpatialInteractive/mapnik-jni.git`
cd mapnik-jni
ant test
```

## Native Binding Installation


