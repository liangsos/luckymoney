# luckymoney -springboot 项目要点
1.配置文件application.yml类似树形文件，用格式将地址分开，在其中写配置时，记得空一格。

2.yml配置

2.1单个配置用@Value 

2.2添加@ConfigurationProperties（prefix =“limit”）注解时，需要在pom.xml文件添加如下依赖：org.springframework.boot spring-boot-configuration-processor true并在@ ConfigurationProperties（prefix =“limit”）上一行用上@Component来注入

3.使用对象配置：在yml配置文件中配置，并新建一个类来获取对象

4.区分测试环境和生产环境，三份配置文件

5.在服务器打包运行的时候使用命令：java -jar -Dspring.profiles.active = prod target / luckymoney-0.0.1-SNAPSHOT.jar来指明参数使用生产环境。

6.项目启动6.1可以项目根目录处用命令：mvn spring-boot：run启动项目6.2若是在服务器上，需要打包之后再运行，使用命令：mvn clean package进行打包再用java -jar [项目。 jar]启动

7.Controller的使用

7.1 @Controller处理http请求

7.2 @RestController这是spring4之后的新注解，原来的版本返回json需要用@ResponseBody配合@Controller来使用

7.3 @RequestMapping配置url映射，有些情况下还是需要用到它

7.4 @PathVariable获取url中的数据

7.5 @RequestParam获取请求参数的值

8.地址映射

8.1使用get：@GetMapping（“/ say”）

8.2使用post：@PostMapping（“/ say”）

8.3同时使用post和get：@RequestMapping（“/ say”）此种方式尽量不用

9.数据库

9.1 mysql

9.2 Spring-Data-Jpa只需要扩展JpaRepository 

9.3三个数据库操作方法save（）findById（）findAll（）

10.四个接口GET POST PUT

11.事务

11.1事务操作一般都放到服务中

11.2 InnoDB支持事务操作，Myisam不支持事务操作

#第二部分

1.使用@Valid表单验证

1.1使用@Valid和@Min限制发红包钱数大于等于10 ，@NotNull不能为空

1.2使用BindingResult来返回验证结果

2.使用AOP处理请求

2.1 AOP是一种编程范式，与语言无关，是一种程序设计思想面向切面

AOP：面向方面编程面向对象

OOP：面向对象编程面向过程

POP：Prodcure Oriented Programming

收到HttpRequest请求->记录请求   ->处理网络请求->生成HttpResponse    ->记录回复

收到数据库操作请求->记录请求      ->增删改查->生成处理结果            ->记录回复

可以将上述的操作切成三部分

2.2

第一步添加依赖spring-boot-starter-aop

第二步添加方面类，添加@Aspect和@Compenent注解，利用@Pointcut，@ Before或@After之类

第三步添加logger来打印日志

3.统一异常处理

3.1异常返回格式统一为json 

3.2 自定义异常，并捕获异常，拿到想要的信息，对它进行封装，再返回给浏览器

3.3继承RuntimeException是因为spring对Exception不会事务回滚，对RuntimeException会事务回滚

3.4使用枚举统一管理errorCode和errorMessage

4.单元测试

4.1测试服务@RunWith注解表示我们要在测试环境里面跑，底层是junit @SpringBootTest表示将启动整个springboot工程

4.2测试API使用MockMvc来进行API测试

在mvn clean package用打包时，会对我们的测试用力进行测试在打包的时候想跳过测试，用命令mvn clean package -Dmaven.test.skip = true

知识点：optiona类 BigDecimal类操作 泛型 枚举enum 
