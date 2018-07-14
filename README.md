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
- `hystrix-turbine` - The Hystrix and turbine.
- `zipkin-server` - The service invoke monitor.

上面是一个最简单的spring cloud示例, 可以理解:

- 服务注册和发现
- 服务调用
- 网关服务
- 断路器使用
- 链路监控


## 适用人群
程序员，Java程序员，JavaEE工程师，Android工程师，大学生，软件工程师，编程爱好者，架构师等。

## 简介
介绍Java相关的代码和实战内容，主要是入门程序。

## 前置知识
Java部分基础。

## 学习效果
掌握Spring Cloud并使用与实际项目，并理解其原理。

* 掌握Spring Cloud及原理和应用场景
* 掌握Spring Cloud的开发架构
* 掌握Spring Cloud整合框架

## 课程内容
Spring Cloud的快速入门。

### [视频课程地址：] (http://study.163.com/course/introduction/1005737038.htm)

##
### 免费Q群：557373922。

### 参考文献:
http://projects.spring.io/spring-cloud/
https://github.com/TechPrimers/spring-cloud-eureka-hystrix-zuul-example
