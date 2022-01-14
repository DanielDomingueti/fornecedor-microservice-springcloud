FROM openjdk:11
MAINTAINER domingueti
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY  . /var/www
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]
