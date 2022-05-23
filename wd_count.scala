var map = sc.textFile("/opt/spark/bin/sample.txt").flatMap(line => line.split(" ")).map(word => (word,1));
var counts = map.reduceByKey(_ + _);
counts.saveAsTextFile("/opt/spark/bin/WD_fri")
