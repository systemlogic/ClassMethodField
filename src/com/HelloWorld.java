package com;
public class HelloWorld extends Hello{
	HelloWorld(){
		
	}
	HelloWorld(int a){
		super();
		public_int_variable = a;
	}
	HelloWorld(float b){
		protected_float_varibale = b;
	}
	double default_variable;
	public int public_int_variable ;
	private long private_long_variable;
	protected float protected_float_varibale ;
	static String static_string_variable;
	final String final_String_variable="";
	public String hello(String str){
		return "Hello "+ str + "!!!";
	}
	protected int increment(int variable){
		return variable + 20;
	}
	private String increment(String variable){
		return variable + 10;
	}
}
class Hello{
	protected int super_int_variable;
	public long increment(long variable){
		return variable + 20;
	}
}