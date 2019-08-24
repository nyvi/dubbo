# dubbo demo
一个dubbo整合SpringBoot的简单例子

## 运行步骤
1. 启动nacos 
2. 启动生产者(dubbo-provider)
3. 启动消费者(dubbo-consumer)
4. 启动<a href="https://github.com/apache/dubbo-admin">dubbo-admin</a>客户端(监控平台需自己打包运行)

## 检查结果
浏览器输入: http://127.0.0.1:8082/sayHello/dubbo  
如果输出: Hello dubbo ! 那么恭喜你,又成功了一步  
你也可以到dubbo的管理平台(就刚刚的dubbo-admin)查看结果,初始账户为:root/root

## 参考文档
<a href="http://dubbo.apache.org/zh-cn/">Apache Dubbo</a>  
<a href="https://github.com/apache/dubbo-spring-boot-project">dubbo-spring-boot-starter</a>  
