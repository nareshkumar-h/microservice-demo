# Microservices

1. user (9001)- web,devtools
2. accounts (9002)- web,devtools
3. apigateway(8080) - web,devtools, zuul
4. discovery(8761) - web,devtools, eurekaserver
5. transaction(9003) - web,devtools, eurekaclient

#### Annotations
* @EnableZuulProxy - API gateway
* @EnableEurekaServer -  Eureka Server
* @EnableDiscoveryClient - Eureka Client
