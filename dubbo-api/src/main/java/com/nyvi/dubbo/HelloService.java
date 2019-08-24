package com.nyvi.dubbo;

/**
 * 服务接口
 *
 * @author czk
 */
public interface HelloService {

    /**
     * 测试方法
     *
     * @param name 输入参数
     * @return 返回参数
     */
    String sayHello(String name);


    /**
     * 测试方法
     *
     * @param name 输入参数
     * @return 返回参数
     */
    String sayGoodBye(String name);

}
