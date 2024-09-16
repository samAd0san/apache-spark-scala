### Setup the enviornment
- #### The Java we chose is 17, Scala 2.13.14, sbt for build tool, add sample code and create the project.
1. Spark runs on Java 8/11/17, Scala 2.12/2.13, Python 3.8+, and R 3.5+. Java 8 prior to version 8u371 support is deprecated as of Spark 3.5.0. When using the Scala API, it is necessary for applications to use the same version of Scala that Spark was compiled for. For example, when using Scala 2.13, use Spark compiled for 2.13, and compile code/applications for Scala 2.13 as well. (ref. doc of spark)
- #### Adding Spark Dependencies
2. **mvnrepository.com** -> org.apache.spark -> import spark-core and spark-sql library in build.sbt