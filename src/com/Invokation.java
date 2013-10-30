package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Invokation {
		Class cls ;
		Object obj;
		Method method ;
		public Invokation() {
			// TODO Auto-generated constructor stub
		}
		public Invokation(String str) throws Exception{
			this();
			cls = Class.forName(str);
		}
		public void createMemory() throws Exception{
			obj = cls.newInstance();
		}
		public void setMethod(String name,Class[] argTypes) throws Exception{
			method = cls.getMethod(name,argTypes);
		}
		public Object invokeMethod(){
			return null;
		}
		public static void main(String...strings) throws Exception{
			Invokation invokation = new Invokation("com.HelloWorld");
			invokation.createMemory();
			System.out.println("--------------hello(String) invocation--------");
			Class[] argTypes = new Class[] { String.class };
			invokation.setMethod("hello", argTypes);
			Object temp = invokation.method.invoke(invokation.obj,"Pranshi");
			System.out.println(temp);
			
			
			try{
			System.out.println("--------------increment(int) invocation--------");
			argTypes = new Class[] { int.class };
			invokation.setMethod("increment",argTypes); //this will throw Exception 
			temp = invokation.method.invoke(invokation.obj,10);//protected method not visible
			System.out.println(temp);
			}catch(Exception e){
				System.out.println("Try to access protected method " +e.getMessage());
			}
			
			System.out.println("--------------constructor + method call---------");
			Constructor constructor = invokation.cls.getConstructor( new Class[] { int.class });
			invokation.obj = constructor.newInstance(20);
			argTypes = new Class[] { long.class };
			invokation.setMethod("increment",argTypes);
			temp = invokation.method.invoke(invokation.obj,10);
			System.out.println("Incremented Value=" + temp);
			Field f = invokation.cls.getField("public_int_variable");
			Object o = f.get(invokation.obj);
			System.out.println("public_int_variable=" + o);
		}
}
