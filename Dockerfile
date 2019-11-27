FROM hirokimatsumoto/alpine-openjdk-11

LABEL author="christian.schmid@attempto.eu"

WORKDIR /

ADD build/libs/kube-demo.jar kube-demo.jar

EXPOSE 8081

ENTRYPOINT java -jar kube-demo.jar