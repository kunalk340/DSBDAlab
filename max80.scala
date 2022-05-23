val lines = sc.textFile("/opt/spark/bin/sample.txt")
val longLines = lines filter { l => l.length > 80}
longLines.saveAsTextFile("/opt/spark/bin/max80")
