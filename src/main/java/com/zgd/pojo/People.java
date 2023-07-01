package com.zgd.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取配置文件，将类的信息注入到Spring中，方式一
 *
 * @ConfigurationProperties(prefix = "car") +@EnableConfigurationProperties(People.class)
 * 注意@EnableConfigurationProperties(People.class)注解在配置类上边，例如MyConfig类。
 */
@Data
@ConfigurationProperties("people")
public class People {
    private String name;
    private String address;
}
