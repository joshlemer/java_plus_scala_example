### Example showing use of both Java and Scala in an SBT project

To run, make sure you have SBT installed, and enter the SBT command line interface:

```
sbt
```

Once in the SBT terminal, you can run the Java application like so
```
> runMain foo.JavaFoo
[info] Running foo.JavaFoo 
Hello Java!
Scala String: This is a Scala String!
Java String: This is a Java String!
[success] Total time: 0 s, completed 3-Apr-2017 3:52:39 PM
```

Or the Scala application like so

```
> runMain foo.ScalaFoo
[info] Running foo.ScalaFoo 
Hello Scala!
Java String: This is a Java String!
Scala String: This is a Scala String!
[success] Total time: 0 s, completed 3-Apr-2017 3:52:37 PM
```
