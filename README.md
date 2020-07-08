
### 介绍
这是一个基于SpringBoot框架设计的一个旅游项目，主要类似于一个电商系统。

### **主要功能介绍**

有用户登录注册，景点列表，相册墙，购买景点，评论，酒店管理和一整套后台管理系统。使用到SMS短信注册验证，JMail进行找回密码邮箱验证，OSS阿里云图片存储服务器，RabbitMQ消息队列以及redis缓存等小技术。整个系统采用Restful风格。以json进行数据的传输。前端页面采用BootStrap以及Layui。

### 软件架构

1.数据库：MySql

2.前端：Layui，BootStrap，Echars等技术

3.后台：SpringBoot、SpringDataJpa等

4.架构模式：半前后分离架构模式

5.模板引擎：thymeleaf

6.项目管理：Maven

### 安装教程

该系统只需要安装RabbitMQ 和Redis

在RabbitMQ中只需要增加sms消息队列即可（RabbitMQ用途目前只用在短信验证信息中）

### 使用说明

完成以上安装，导入数据库后，即可运行Application

##### **前台访问路径：**

```
http://localhost:8080/dist/view
```

##### **后台访问路径：**

```
http://localhost:8080/admin/adminlogin
```





