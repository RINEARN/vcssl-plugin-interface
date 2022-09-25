# VCSSL/Vnano Plug-in Interfaces

The repository for defining/updating plug-in interfaces available on VCSSL/Vnano scripting engines.


## License

This package is released under [CC0](https://creativecommons.org/publicdomain/zero/1.0/deed).


## Requirements

The interface files in this repository are written in Java&reg;, 
so it requires Java Development Kit (JDK) for developing plug-ins.


## How to Use

Probably, the interface files in this repository are located (bundled) in "plugin" folder of apps (e.g.: [RINPn](https://github.com/RINEARN/rinpn)) equipped with VCSSL/Vnano scripting engine.

In the "plugin" folder, create a new plug-in class, and in it "implement" the interface you want to use, for example:

    (in plugin/MyFunctionPlugin.java)

    import org.vcssl.connect.ExternalFunctionConnectorInterface1;

    public class MyFunctionPlugin implements ExternalFunctionConnectorInterface1 {
        ...
    }

Then compile the above new plug-in, and register it to be loaded from apps.

How to register plug-ins depends on the app you are using.
For example, if you are using [RINPn](https://github.com/RINEARN/rinpn), 
append the file name/path of the compiled plug-in into the text file "VnanoPluginList.txt" as follows:

    (in plugin/VnanoPluginList.txt)

    ...
    MyFunctionPlugin.class

## Documents

You can see the documents of the interfaces on the web:

* [Specification Documents in English](https://www.vcssl.org/en-us/doc/connect/)
* [Specification Documents in Japanese](https://www.vcssl.org/ja-jp/doc/connect/)

The above documents (HTML files) are also contained in this repository.
They are located in the same place with the source files of the interfaces.


## Credits

- Oracle and Java are registered trademarks of Oracle and/or its affiliates. 


