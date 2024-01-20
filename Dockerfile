FROM public.ecr.aws/lambda/java:17

COPY target/classes ${LAMBDA_TASK_ROOT}
COPY /target/dependency/* ${LAMBDA_TASK_ROOT}/lib/

EXPOSE 8080

CMD [ "org.example.HandlerClass::handleRequest" ]


# https://gallery.ecr.aws/lambda/java
# rodar mvn: mvn compile dependency:copy-dependencies -DincludeScope=runtime
#docker build -t local_lambda .
# docker run -p 9001:8080 local_lambda:latest
# curl -XPOST "http://localhost:9001/2015-03-31/functions/function/invocations" -d '{"nome":"hello world!"}'
