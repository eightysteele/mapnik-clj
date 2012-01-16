# What is the mapnik-clj project?

Mapnik-clj wraps the [Mapnik](https://github.com/mapnik/mapnik) C++ API in [Clojure](https://github.com/clojure/clojure). Mapnik is an API for building beautiful maps. Projects like [CartoDB](http:cartodb.com) and [TileMill](http://mapbox.com/tilemill/) use it for rending and tiling thier map tiles.

Here's our first tile!

![](https://s3.amazonaws.com/uploads.hipchat.com/10153/26983/kg8ormtrglj0c8i/cakenutd.png)

# Let's get started

This project depends on the [mapnik-jni](https://github.com/SpatialInteractive/mapnik-jni) for Java Mapnik bindings.

## Install Mapnik & Friends
 
To use Mapnik-clj you'll need a local installation of Mapnik.

### OS X

On OS X Lion, install Mapnik with [homebrew](http://mxcl.github.com/homebrew/):

```bash
brew update
sudo chown -R $USER /Library/Python # for OS X Python
brew install --use-clang  mapnik
```

If `cairomm` fails, you may need to install it with Macports before proceeding:

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

### OS X Lion

The OS X bindings have been prebuilt and uploaded to the [mapnik-clj download page](https://github.com/eightysteele/mapnik-clj/downloads). Download the OS X native binding and place it somewhere on `JAVA_LIBRARY_PATH`. (I prefer `/opt/local/lib`). Check if everything's dandy by running `lein midje` in the project directory.

If you get an `UnsatisfiedLinkException`, you'll probably have to build the bindings from scratch for you own system. To do this, run the follow commands in the terminal:

```bash
git clone https://github.com/SpatialInteractive/mapnik-jni.git`
cd mapnik-jni
ant test
```

The OS X native binding will be located at `build/dist/libmapnik-jni.jnilib` in the `mapnik-jni` directory. Use this instead of the mapnik-clj-supplied binding and you should be good to go.

### Ubuntu

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

Move the native binding inside of `build/dist` to somewhere on `JAVA_LIBRARY_PATH` and you'll be ready to move on to the project demo.


