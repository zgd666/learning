package com.zgd.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取配置文件，将类的信息注入到Spring中，方式一
 *
 * @Component
 * @ConfigurationProperties(prefix = "car")
 */
@Component
@ConfigurationProperties(prefix = "car")
public class Car {
    private String carName;
    private Float price;

    public Car() {
    }

    public Car(String carName, Float price) {
        this.carName = carName;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
