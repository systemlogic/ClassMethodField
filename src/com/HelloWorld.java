package com;
public class HelloWorld extends Hello{
	double default_variable;
	public int public_int_variable ;
	@SuppressWarnings("unused")
	private long private_long_variable;
	protected float protected_float_varibale ;
	static String static_string_variable = "Static value";
	final String final_String_variable="Final Before value";
	
	HelloWorld(){
		super();
	}
	public HelloWorld(int a){
		super(a);
		public_int_variable = a;
	}
	HelloWorld(float b){
		protected_float_varibale = b;
	}
	public String hello(String str){
		return "Hello "+ str + "!!!";
	}
	protected int increment(int variable){
		return public_int_variable + variable;
	}
	@SuppressWarnings("unused")
	private String increment(String variable){
		return variable + 10;
	}
}
class Hello{
	protected int super_int_variable;
	public Hello(){
		super_int_variable = 0;
	}
	public Hello(int value){
		super_int_variable = value;
	}
	public long increment(long variable){
		return variable + super_int_variable;
	}
}