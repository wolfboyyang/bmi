FROM 100.125.0.198:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/bmi/calculator-1.0-SNAPSHOT-exec.jar .
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]