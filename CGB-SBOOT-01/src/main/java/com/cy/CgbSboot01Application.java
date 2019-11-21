package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication 注解一般用于修饰或描述 springBoot项目的启动类
 * 用于告诉底层系统对此启动类所在的包以及自雷包中的类进行扫描，检测此类是否是一个
 * 由spring管理的对象
 */
@SpringBootApplication
public class CgbSboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}

}
