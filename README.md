# What is the mapnik-clj project?

The mapnik-clj project is a [Clojure](https://github.com/clojure/clojure) wrapper for [Mapnik](https://github.com/mapnik/mapnik), an API for building beautiful maps.

# Let's get started

As a starting point we'll want to look at the [mapnik-jni](https://github.com/SpatialInteractive/mapnik-jni) project for Java bindings to Mapnik.

# Build Instructions

## Mapnik & Friends

Download and install mapnik and its dependencies with [homebrew](http://mxcl.github.com/homebrew/):

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

## Mapnik-JNI

Build  Mapnik-JNI:

```bash
git clone https://github.com/SpatialInteractive/mapnik-jni.git`
cd mapnik-jni
ant test
```

## Native Binding Installation


