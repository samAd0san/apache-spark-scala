import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    // Create SparkSession and assign it to `spark`
    val spark = SparkSession.builder
      .master("local")
      .appName("Word Count")
      .config("spark.driver.bindAddress", "127.0.0.1")
      .getOrCreate()

    // Read CSV file into a DataFrame
    val df = spark.read
      .option("header", value = true)
      .csv("D:\\Scala\\apache-spark\\AAPL.csv")

    // Show the contents of the DataFrame
    df.show()
  }
}