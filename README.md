# openfire-plugin-example

Building the [Openfire plugin](http://download.igniterealtime.org/openfire/docs/latest/documentation/plugin-dev-guide.html) with Gradle.

Project Structure:

```
openfire-plugin-example/
|-- openfire/
|-- src/
    |-- main/
        |-- java/**/*.java
        |-- resources/
        |-- database/
        |-- i18n/
        |-- web/
        |-- plugin.xml
        |-- readme.html
        |-- changelog.html
        |-- logo_small.gif
        |-- logo_large.gif
```

Checkout this project:

```sh
$ git clone https://github.com/shrhdk/openfire-plugin-example
```

Download and extract [Openfire](https://www.igniterealtime.org/downloads).

```
openfire-plugin-example/
|-- openfire/  <- extracted
    |-- README.html
    |-- ...
```

Build and deploy this project:

```sh
$ ./gradlew deployJar
```

As a result `example.jar` will be built:

```
openfire-plugin-example/
|-- build/
    |-- distributions/
        |-- example.jar  <- built
```

And `example.jar` will be copied to `plugins` directory:

```
openfire-plugin-example/
|-- openfire/
    |-- plugins/
        |-- example.jar  <- copied
```

Launch Openfire:

```sh
$ openfire/bin/openfire run
Openfire 4.0.3 [Nov 12, 2016 4:44:25 PM]
Admin console listening at:
  http://localhost:9090
  https://localhost:9091
ExampleComponent initialzie, JID: example.localhost
<iq type="get" id="456-1" from="component.localhost" to="example.localhost">
  <query xmlns="http://jabber.org/protocol/disco#info"/>
</iq>
```

(** Set up the openfire from admin console (http://localhost:9090) at the firsttime. **)
