# kafka-Spring-Boot
Kafka pub-sub example using spring boot

#To start zookeeper Server run the below command...
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

#To start kafka server run the below command...
.\bin\windows\kafka-server-start.bat .\config\server.properties

#To create topic
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Topic_Name_Here

# See the publish message in the kafka console..
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
