package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import javax.annotation.PostConstruct;

/**
 * @Date : 2019/3/6
 * @Author : 汪京陆(Ben)[wangjinglu@souche.com]
 * @CopyRight : DataTeam @ SouChe Inc
 * @Desc :
 */
public class TestClass {

	@Autowired
	@Qualifier("aString")
	private String val;

	private TestClass test;


	public TestClass getTest() {
		return test;
	}

	public void setTest(TestClass test) {
		this.test = test;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
