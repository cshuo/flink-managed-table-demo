FROM maven:3.6-jdk-8-slim AS builder

# the flink image built before.
FROM $FLINK_VERSION

# Copy sql-client script
COPY bin/* /opt/sql-client/
RUN mkdir -p /opt/sql-client/lib

# Copy configuration
COPY conf/* /opt/flink/conf/

WORKDIR /opt/sql-client
ENV SQL_CLIENT_HOME /opt/sql-client


COPY docker-entrypoint.sh /

RUN ["chmod", "+x", "/docker-entrypoint.sh"]
RUN ["chmod", "+x", "/opt/sql-client/sql-client"]
ENTRYPOINT ["/docker-entrypoint.sh"]
