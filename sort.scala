var map = sc.textFile("/opt/spark/bin/sample.txt").flatMap(line => line.split(" ")).map(word => (word,1));
var counts = map.reduceByKey(_ + _);
val keysRdd = counts.keys
val sorted = keysRdd.sortBy(x => x, true)
sorted.collect
sorted.saveAsTextFile("/opt/spark/bin/sort_fri")
