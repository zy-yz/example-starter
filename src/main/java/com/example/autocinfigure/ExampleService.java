package com.example.autocinfigure;

/**
 *SpringBoot在启动的时候会去扫描项目中的jar包，寻找其中含有spring.factorios文件的jar包
 *  根据这个文件来加载aotoconfig类
 * 通过@conditional注解的条件，进行自动配置并加载到spring-context中
 * */
public class ExampleService {

    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
