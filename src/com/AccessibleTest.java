package com;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class AccessibleTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			AccessibleObject ao ;
			Class cls = Class.forName("com.HelloWorld");
			Field privateField = cls.getDeclaredField("private_long_variable");
			privateField.setAccessible(true);
			Object o = cls.newInstance();
			System.out.println("-------------------Private field original value--------------");
			System.out.println("private_long_variable="+privateField.get(o));
			privateField.set(o , 10);
			System.out.println("-------------------Private field updated value--------------");
			System.out.println("private_long_variable="+privateField.get(o));
			
	}

}
