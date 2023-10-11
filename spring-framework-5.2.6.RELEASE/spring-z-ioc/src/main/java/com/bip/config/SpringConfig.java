package com.bip.config;

import com.bip.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XuHan
 * @date 2023/10/10 20:15
 * config类相当于是 xml文件
 */
@Configuration
public class SpringConfig {

	/**
	 * <bean id = "myBean" class = "com.bip.bean.MyBean">
	 *
	 *     </bean>
	 *
	 * @return
	 */
	@Bean
	public MyBean myBean(){
		return new MyBean();
	}


}
