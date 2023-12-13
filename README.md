# GC-TEST

To run the file use the follwing commands with the mentioned JAVA_OPTS:
```
$ javac GcTest.java
```

- To use Generational ZGC:
```
$ java -Xmx6G -XX:+UseZGC -XX:+ZGenerational "-Xlog:gc*:file=gc.log" GcTest
```
- To use ShenandoahGC:
```
$ java -Xmx6G -XX:+UseShenandoahGC "-Xlog:gc*:file=gc.log" GcTest
```
