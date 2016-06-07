package sparkdemo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.hive.HiveContext;
import org.apache.spark.storage.StorageLevel;

public class driver {

	public static void main(String[] args) {
		SparkConf sc = new SparkConf().setAppName("Test");
		JavaSparkContext jsc = new JavaSparkContext(sc);
		HiveContext sqlContext = new HiveContext(jsc.sc());
		sqlContext.setConf("spark.sql.tungsten.enabled", "false");

		sqlContext.setConf("hive.exec.dynamic.partition", "true");
		sqlContext.setConf("hive.exec.dynamic.partition.mode", "nonstrict");

		DataFrame sample_100 = sqlContext.table("hivedemo.sample_100").persist(StorageLevel.MEMORY_ONLY());
		DataFrame sample_10k = sqlContext.table("hivedemo.sample_10k").persist(StorageLevel.MEMORY_ONLY());

		DataFrame crossjoin = sample_100.join(sample_10k);
		// i.printSchema();
		crossjoin.write().mode(SaveMode.Overwrite).insertInto("hivedemo.sample_output");
	}

}