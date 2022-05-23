val lines = sc.textFile("/opt/spark/bin/weblog.txt") // read text file
val errorLines = lines filter { l => l.contains("200")}
val warningLines = lines filter { l => l.contains("302")}
val errorCount = errorLines.count
val warningCount = warningLines.count
errorLines.saveAsTextFile("/opt/spark/bin/error_cnt1")
warningLines.saveAsTextFile("/opt/spark/bin/warn_cnt1")	
