# Spring Boot Jaeger Example

## Jaeger Setup
- Start Jaeger using Docker

docker run -d --name jaeger-ui -p 16686:16686 -p 6831:6831/udp jaegertracing/all-in-one:1.9

- Accessible at - http://localhost:16686/

## Endpoints
- /jaeger/client/{id} - Exposed in jaeger-client
- /jaeger/client/{id} - Exposed in jaeger-server. Connects to numbers api - numbersapi.com
