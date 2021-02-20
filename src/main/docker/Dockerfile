FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp 
ADD *.jar app.jar 
RUN sh -c 'touch /app.jar' 
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75" 
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]