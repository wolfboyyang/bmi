FROM java:8-jre-alpine

WORKDIR /home/apps/
ADD target/bmi/${project.parent.artifactId}/$ARTIFACT_ID-${project.version}-exec.jar .
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]