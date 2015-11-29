package com.sourav.learning;

public class HelloWorld {
	private String message ;
	
	public void init(){
		System.out.print("Inside Init ");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void destroy(){
		System.out.print("Inside Destroy ");
	}

}
