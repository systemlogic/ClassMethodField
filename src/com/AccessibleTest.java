package com;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AccessibleTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
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
			
			System.out.println("-------------------Final variable access---------------------");
			Field finalField = cls.getDeclaredField("final_String_variable");
			finalField.setAccessible(true);
			Object finalObject = cls.newInstance();
			System.out.println("Before : " + finalField.get(finalObject));
			finalField.set(finalObject, "New Final variable value");
			System.out.println("After : " + finalField.get(finalObject));
			
			
			System.out.println("-------------------Static variable access---------------------");
			Field staticField = cls.getDeclaredField("static_string_variable");
			Object staticObject = cls.newInstance();
			System.out.println("Before : " + staticField.get(staticObject));
			staticField.set(staticObject, "New Static value");
			System.out.println("After : " + staticField.get(staticObject));
	}

}
