package com.zgd.config;

import com.zgd.pojo.People;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * proxyBeanMethods = false表示不被spring代理。
 * proxyBeanMethods = true会spring代理。创建出来的对象是单例的。呗spring容器管理
 */
@Configuration()
@EnableConfigurationProperties(People.class)
public class MyConfig {
}
