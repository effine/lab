#!/bin/bash

mkdir target
cat ./mesos-deploy-rest-api.jsonn \
| jq '.container.docker.image |= "docker-hub.product.co-mall:5000/cybershop-swagger-ui-%system.TEAM_NAME%"' \
| jq '.id |= "cybershop-swagger-ui-%system.TEAM_NAME%"' \
 > target/marathon.json
