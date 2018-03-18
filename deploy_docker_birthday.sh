#!/bin/bash

echo "=============================="
echo " Copying propertie files to:"
echo " /tmp/config-properties"
echo "=============================="
./init_properties.sh

echo "propertie files copied ....... [ OK ]"

echo "---"
echo "---"

echo "========================================="
echo " Running config-server and eureka server"
echo "========================================="
docker-compose up -d config-server eureka
sleep 10s
echo "config-server and eureka server ....... [ OK ]"
docker-compose ps
echo "---"
echo "---"

echo "======================================================"
echo " Running customer catalog order zuul turbine services"
echo "======================================================"
docker-compose up -d customer catalog order zuul turbine
sleep 15s
echo "customer, catalog, order, zuul, turbine services ....... [ OK ]"
docker-compose ps
echo "====================================="
echo " You can go to http://localhost:8080"
echo "====================================="
