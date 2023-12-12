# GC-TEST

To run the file use the follwing commands with the mentioned JAVA_OPTS:
```
$ javac GcTest.java
```

```
$ java -Xmx2G -XX:+UseZGC -XX:+ZGenerational "-Xlog:gc*:file=gc.log" GcTest
```
