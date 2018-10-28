#!/bin/sh
#Getting the Grid Up and Running
docker-compose up -d

#Scaling Chrome Nodes to Five
docker-compose scale chromenode=5

sleep 5
#Scaling FireFox Nodes to Five
#docker service scale firefoxnode = 5

#Doing a maven Clean and Install
mvn clean install
#Running The main Class
mvn exec:java \
    -Dexec.cleanupDaemonThreads=false \
    -Dexec.mainClass=runner.main.TestRunnerClass

#Destroying The Grid
docker-compose down



