package com.bip;

import com.bip.bean.MyBean;
import com.bip.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XuHan
 * @date 2023/10/10 10:20
 */
public class Test {
	public static void main(String[] args) {
		//测试可行性
		// System.out.println(11111111);

			// 启动Spring IOC 容器
		 // 1.基于xml的形式

		//	 2.基于注解的方式
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		MyBean myBean = applicationContext.getBean(MyBean.class);

		String xuhan = myBean.sayHello("许晗");

		System.out.println(xuhan);

	}
}
