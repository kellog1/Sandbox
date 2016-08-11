package com.demo.spark;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;


public class App 
{
    public static void main( String[] args )
    {
    	SparkConf conf = new SparkConf().setAppName("AWS EMR Demo");
    	JavaSparkContext sc = new JavaSparkContext(conf);
    	
		List<String> strings = Arrays.asList("Hello", "World");
		JavaRDD<String> s1 = sc.parallelize(strings);
		List<String> s = s1.collect();
		
		for (String ss : s) {
			
			System.out.println(ss);
		}
		

		
    }
}
