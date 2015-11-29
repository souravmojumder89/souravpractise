package com.sourav.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
		 //"helloWorld"- this id is configured in the beans.xml which returns the object 
	      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
	      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
	      //before initialization
	    /*  System.out.println("before intialization :"+"*******");
	      obj.getMessage();
	      System.out.println("After intialization :"+"*******");
	      obj.setMessage("In Spring Pojo");
	      obj.getMessage();*/
	      System.out.println("Object 1 : " );
	      obj1.getMessage();
	      obj2.setMessage("Object 2");
	      System.out.println("Object 2 : " );
	      obj2.getMessage();
	      System.out.println("again object 1");
	      obj1.getMessage();
	      
	
	}

}
