FROM flink:1.14.0-scala_2.12

RUN apt-get update
RUN apt install tree

RUN rm -rf /opt/flink/lib/*
RUN rm -rf /opt/flink/opt/*
COPY ./lib/* /opt/flink/lib/
COPY ./connector_jar/* /opt/flink/lib/
COPY ./opt/* /opt/flink/opt/
