package com.sourav.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = null ;
		try{
			//context = new XmlWebApplicationContext();
			// ApplicationContext context = 
		             //new ClassPathXmlApplicationContext("Beans.xml");
		          AbstractApplicationContext   context = 
				             new ClassPathXmlApplicationContext("Beans.xml");


			// context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		obj1.setMessage("Object 1");
		System.out.println(obj1.getMessage());
		obj2.setMessage("Object 2");
		System.out.println(obj2.getMessage());
		System.out.println(obj1.getMessage());
		 context.registerShutdownHook();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			//context.
		}

	}

}
