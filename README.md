
👋 Hi, I’m @alankarapte

# this project demonstrate rest web services using Jersey (JAX-RS)

# Dependancies used:

* Spring data JPA
* DevTool
* Jersey
* H2 database (for console- http://localhost:8080/h2-console)
* lombok

# Package name guide:

### resource package:
* this is resource package,
* it is equal to controller package in spring rest 
* but in JAX-RS good practice is to name it as resource

### dao package:
* contain data access layer
* it is equal to repository package in spring rest 

### model package:
* contain domain classess


# Point to be noted

* I have used @PostConstruct which is one of the way to running logic on startup, we are using H2 DB (in memory) so I ran the logic to insert some records into H2 DB.

* I have not used any spring MVC component here so there is no DiscpatcherServlet, so someone need to scan resources e.g. EmployeeResource. I need to add some scanner who will scan for resource classes which I added in config package by class as 'public class RestConfig extends org.glassfish.jersey.server.ResourceConfig'. I used constructor from supreclass in it to register resource classes e.g. EmployeeResource class

* I have not annotate DAO layer i.e. repository with @Repository annotation

* I have used @Path which equals to @RequestMapping in spring rest

* I have not used service layer just for simplicity

* @POST, @PUT, @DELETE, @Consumes, @Produces, @PathParam  








---
---
---

# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.alankar.spring-boot-rest-jersey-demo' is invalid and this project uses 'com.alankar.springbootrestjerseydemo' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Jersey](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-jersey)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

