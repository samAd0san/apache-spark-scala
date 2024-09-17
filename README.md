### Setup the enviornment
- #### The Java we chose is 17, Scala 2.13.14, sbt for build tool, add sample code and create the project.
1. Spark runs on Java 8/11/17, Scala 2.12/2.13, Python 3.8+, and R 3.5+. Java 8 prior to version 8u371 support is deprecated as of Spark 3.5.0. When using the Scala API, it is necessary for applications to use the same version of Scala that Spark was compiled for. For example, when using Scala 2.13, use Spark compiled for 2.13, and compile code/applications for Scala 2.13 as well. (ref. doc of spark)
- #### Adding Spark Dependencies
2. **mvnrepository.com** -> org.apache.spark -> import spark-core and spark-sql library in build.sbt

### What is Apache Spark?
- **Apache Spark** is a (lightning-fast, open-source) data-processing engine for machine learning and AI applications in big data.
- Apache Spark (Spark) easily handles large-scale data sets and is a fast, general-purpose clustering system.
- Spark's analytics engine processes data 10 to 100 times faster than some alternatives, such as Hadoop for smaller workloads. It scales by distributing processing workflows across large clusters of computers, with built-in parallelism and fault tolerance. 
- It even includes APIs for programming languages that are popular among data analysts and data scientists, including Scala, Java, Python, and R.

### Adding and Reading a CSV file
- We are first downloading the CSV file from **Kaggle.com**.
- Instantiate the standalone SparkSession
- Read csv file with option
- Show Dataframe
- Add JVM option ```--add-exports java.base/sun.nio.ch=ALL-UNNAMED```<br>
**docs ref.**
- <a>https://spark.apache.org/docs/latest/api/scala/org/apache/spark/sql/SparkSession.html</a>
- <a>https://spark.apache.org/docs/3.5.2/sql-data-sources-csv.html#content</a>
- <a>https://www.kaggle.com/datasets/jacksoncrow/stock-market-dataset</a><br>
**O/P**
```
+----------+------------------+------------------+------------------+------------------+-------------------+---------+
|      Date|              Open|              High|               Low|             Close|          Adj Close|   Volume|
+----------+------------------+------------------+------------------+------------------+-------------------+---------+
|1980-12-12|0.5133928656578064|          0.515625|0.5133928656578064|0.5133928656578064|0.40678155422210693|117258400|
|1980-12-15|0.4888392984867096|0.4888392984867096|0.4866071343421936|0.4866071343421936|  0.385558158159256| 43971200|
|1980-12-16|          0.453125|          0.453125|0.4508928656578064|0.4508928656578064| 0.3572602868080139| 26432000|
|1980-12-17|0.4620535671710968|0.4642857015132904|0.4620535671710968|0.4620535671710968| 0.3661033511161804| 21610400|
|1980-12-18|0.4754464328289032|0.4776785671710968|0.4754464328289032|0.4754464328289032|0.37671515345573425| 18362400|
|1980-12-19|0.5044642686843872|0.5066964030265808|0.5044642686843872|0.5044642686843872| 0.3997070789337158| 12157600|
|1980-12-22|0.5290178656578064|           0.53125|0.5290178656578064|0.5290178656578064| 0.4191618859767914|  9340800|
|1980-12-23|0.5513392686843872|0.5535714030265808|0.5513392686843872|0.5513392686843872| 0.4368479549884796| 11737600|
|1980-12-24|0.5803571343421936|0.5825892686843872|0.5803571343421936|0.5803571343421936| 0.4598398804664612| 12000800|
|1980-12-26|0.6339285969734192|0.6361607313156128|0.6339285969734192|0.6339285969734192| 0.5022867918014526| 13893600|
|1980-12-29|0.6428571343421936|0.6450892686843872|0.6428571343421936|0.6428571343421936|  0.509361207485199| 23290400|
|1980-12-30|0.6294642686843872|0.6294642686843872|0.6272321343421936|0.6272321343421936| 0.4969809353351593| 17220000|
|1980-12-31|0.6116071343421936|0.6116071343421936|          0.609375|          0.609375|0.48283201456069946|  8937600|
|1981-01-02|0.6160714030265808|0.6205357313156128|0.6160714030265808|0.6160714030265808| 0.4881376624107361|  5415200|
|1981-01-05|0.6049107313156128|0.6049107313156128|0.6026785969734192|0.6026785969734192| 0.4775262176990509|  8932000|
|1981-01-06|          0.578125|          0.578125|0.5758928656578064|0.5758928656578064| 0.4563027024269104| 11289600|
|1981-01-07|0.5535714030265808|0.5535714030265808|0.5513392686843872|0.5513392686843872| 0.4368479549884796| 13921600|
|1981-01-08|0.5424107313156128|0.5424107313156128|0.5401785969734192|0.5401785969734192|0.42800483107566833|  9956800|
|1981-01-09|0.5691964030265808|0.5714285969734192|0.5691964030265808|0.5691964030265808|0.45099684596061707|  5376000|
|1981-01-12|0.5691964030265808|0.5691964030265808|0.5647321343421936|0.5647321343421936|0.44745975732803345|  5924800|
+----------+------------------+------------------+------------------+------------------+-------------------+---------+
only showing top 20 rows
```
