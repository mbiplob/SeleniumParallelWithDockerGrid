#!/bin/sh
#Getting the Grid Up and Running
docker-compose up -d

#Scaling Chrome Nodes to Nine
docker-compose scale chromenode=7


#Scaling FireFox Nodes to Five
#docker service scale firefoxnode = 5

#Doing a maven Clean and Install
mvn clean
mvn install

sleep 10
#Running The main Class
mvn exec:java \
    -Dexec.cleanupDaemonThreads=false \
    -Dexec.mainClass=runner.main.TestRunnerClass

#Destroying The Grid
docker-compose down



