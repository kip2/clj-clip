# clj-clip

A simple library for handling the clipboard within the Clojure REPL.

[Clojars Library page](https://clojars.org/com.github.kip2/clj-clip)

## Installation

Add the following dependency to your project.

Leiningen/Boot

```clojure
[com.github.kip2/clj-clip "0.1.0"]
```

Clojure CLI/deps.edn

```clojure
com.github.kip2/clj-clip {:mvn/version "0.1.0"}
```

Gradle

```gradle
implementation("com.github.kip2:clj-clip:0.1.0")
```

Maven

```xml
<dependency>
  <groupId>com.github.kip2</groupId>
  <artifactId>clj-clip</artifactId>
  <version>0.1.0</version>
</dependency>
```

## Usage

To use the clipboard within the REPL:

```clojure
(require '[com.github.kip2 :as clip])

;; To set text to the clipboard
(clip/write-clip "Hello, Clojure!")

;; To get text from the clipboard
(clip/read-clip) ; => "Hello, Clojure!"

```

## License

Copyright © 2024 kip2

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
