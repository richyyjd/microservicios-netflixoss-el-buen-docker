# Happy Docker birthday 5th!!!
### March 23th, 2018


__This project has some improvements from original project (https://github.com/ewolff/microservice)__.
+ An improvement is the implementation of Config Server in order to have outside the project propertie files for each microservice.
+ The docker-compose.yml file inside the code folder include config-server service, you can use it to build new docker images if you want.
+ I have added a docker-compose.yml pointing to my dockerhub repo to pull the docker images for this docker birthday.
+ I have created an script 'init-properties.sh' in order to copy config-properties folder to a local path (/tmp/config-properties/).
+ I have added an script 'deploy_docker_birthday.sh' to pull and deploy containers.

## How to run this repo
```
$ ./deploy_docker_birthday.sh
```
