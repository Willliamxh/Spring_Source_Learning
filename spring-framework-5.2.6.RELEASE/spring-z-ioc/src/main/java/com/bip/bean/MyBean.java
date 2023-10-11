package com.bip.bean;

/**
 * @author XuHan
 * @date 2023/10/10 20:03
 */
public class MyBean {

	private Integer age;

	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 业务方法
	 * @param name
	 * @return
	 */
	public String sayHello(String name){
		return "hello,"+name;
	}
}
