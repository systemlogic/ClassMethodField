package com;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Synthetic {
    public static void main(String... args) throws Exception{
		AccessibleObject ao ;
		Class cls = Class.forName("com.HelloWorld");
		Field privateField = cls.getDeclaredField("private_long_variable");
		privateField.setAccessible(true);
		Object obj = cls.newInstance();
		System.out.println("-------------------Private field original value--------------");
		System.out.println("private_long_variable="+privateField.get(obj));
		privateField.set(obj , 10);
		System.out.println("-------------------Private field updated value---------------");
		System.out.println("private_long_variable="+privateField.get(obj));
		Class[] argTypes = new Class[] { String.class };
		Method method = cls.getDeclaredMethod("increment", argTypes);
		method.setAccessible(true);
		Object temp = method.invoke(obj, "20");
		System.out.println("-------------------Private Method access---------------------");
		System.out.println("private method return value=" + temp);
		
		argTypes = new Class[] {};
		method = cls.getMethod("wait", argTypes);
		System.out.println(method.isSynthetic());
    }
}
