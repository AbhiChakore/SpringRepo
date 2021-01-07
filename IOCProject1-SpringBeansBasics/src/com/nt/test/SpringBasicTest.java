package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class SpringBasicTest {

	public static void main(String[] args) {
		// Locate and hold spring bean cfgs file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");

		//create IOC container(XMLBeanFactory)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		//get spring bean class objects from springcontainer /IOC container
		Date d=(Date)factory.getBean("dt");
		System.out.println("d obj data::"+d);
		System.out.println("..........................");
		WelcomeGreetings greetings1=(WelcomeGreetings)factory.getBean("wg");
		WelcomeGreetings greetings2=(WelcomeGreetings)factory.getBean("wg");
		WelcomeGreetings greetings3=(WelcomeGreetings)factory.getBean("wg");
		System.out.println("message::"+greetings1.welcome("raja"));
		System.out.println("H1"+greetings1.hashCode());
		System.out.println("H2"+greetings2.hashCode());
		System.out.println("H3"+greetings3.hashCode());
		
	}

}
