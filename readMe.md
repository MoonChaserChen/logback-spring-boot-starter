## Spring Boot 快速集成 logback（缺省logback-spring.xml文件配置）

### 如何使用logback-spring-boot-starter

* 引入依赖
```
<dependency>
    <groupId>ink.akira</groupId>
    <artifactId>logback-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

* 增加配置
```
logback.project-name=XXX
logback.log-home=/data/logs/XXX
```

### 说明

* 控制台输出debug级别
* 日志文件分debug级别，info级别， error级别，按天生成
* 默认日志目录结构如下：

![logback-spring-boot-starter](http://image.akira.ink/logback-spring-boot-starter/logback-spring-boot-starter.png)