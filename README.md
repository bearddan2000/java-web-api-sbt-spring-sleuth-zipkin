# java-web-api-sbt-spring-sleuth-zipkin

## Description
A springboot app that uses distributed logging
to trace api call. This will simulate a call
to a remote service by chaining a single call
through 2 services.

### STEP 1
Once the project is done building, make
some api calls `http://localhost:81`.

### STEP 2
- goto http://localhost
- click on "Find a trace"
  - search by "serviceName"

## Tech stack
- java
- sbt
  - springboot
  - zitkin
  - sleuth

## Docker stack
- gradle:jdk11
- openzipkin/zipkin

## To run
`sudo ./install.sh -u`
- ZIPKIN DASHBOARD http://localhost
- API http://localhost:81

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- https://spring.io/guides/gs/routing-and-filtering/
- https://github.com/openzipkin-attic/docker-zipkin/blob/master/docker-compose.yml
- https://cloud.spring.io/spring-cloud-sleuth/1.3.x/multi/multi__sending_spans_to_zipkin.html
- https://howtodoinjava.com/microservices/spring-cloud-zipkin-sleuth-tutorial/
- https://www.javainuse.com/spring/cloud-sleuth
- https://stackoverflow.com/questions/42032303/how-do-i-use-a-maven-bom-bill-of-materials-to-manage-my-dependencies-in-sbt
