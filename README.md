# learning-spring-cloud

learning-spring-cloud

从入门到精通

# Spring Cloud Eureka, Hystrix and Zuul Example

## Components
- `eureka-service` - The Eureka service which is the Service Registry.
- `hello-server` - The Service which is going to give data to the Client.
- `hello-client` - The Service which is going to get data from Server via the Discovery Service from the Service Registry (`eureka-service`).
- `zuul-service` - This is the Gateway/Edge Service which is registered with Eureka and routes the requests to Client
 and Server using Eureka Service with Hystrix support.

上面是一个最简单的spring cloud示例, 可以理解:

- 服务注册和发现
- 服务调用
- 网关服务
- 断路器使用