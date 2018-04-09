# dubbo demo
一个dubbo整合SpringBoot的简单例子

## 运行步骤
1. 启动zookeeper
2. 启动<a href="https://github.com/dubbo/dubbo-ops">dubbo-admin</a>客户端(需自己打包运行)
3. 启动生产者(dubbo-provider)
4. 启动消费者(duboo-consumer)

## 检查结果
浏览器输入: http://127.0.0.1:8082/sayHello/dubbo  
如果输出: Hello dubbo ! 那么恭喜你,又成功了一步  
你也可以到duboo的管理平台(就刚刚的dubbo-admin)查看结果,初始账户为:root/root
## 参考文档
<a href="https://github.com/alibaba/dubbo-spring-boot-starter">dubbo-spring-boot-starter</a>  
<a href="http://dubbo.apache.org/books/dubbo-user-book/">dubbo user guide</a>  
<a href="http://dubbo.apache.org/books/dubbo-admin-book/">dubbo admin guide</a>
