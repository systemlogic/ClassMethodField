package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMethodField {
	Class<?> cls ;
	ClassMethodField(Class<?> cls){
		this.cls = cls; 
	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ClassMethodField obj2 = new ClassMethodField(HelloWorld.class);
		ClassMethodField obj3 = new ClassMethodField(Class.forName("com.HelloWorld"));
		
		ClassMethodField[] clsArr =  {obj2};
		
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Declared Fields-------------------");
			Field[] field = obj.cls.getDeclaredFields();
			for(Field temp_constructor :field){
				System.out.println(temp_constructor.getName());
				
			}
		}
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Fields----------------------------");
			Field[] ff = obj.cls.getFields();
			for(Field field :ff){
				System.out.println(field.getName());
				
			}
		}
		
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Declared Fields and Type----------");
			Field[] ff = obj.cls.getDeclaredFields();
			for(Field field :ff){
				System.out.println("Modifier :" + field.getModifiers() + " for variable "+ field.getName());
				
			}
		}

		
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Constructor-----------------------");
			Constructor[] ff = obj.cls.getDeclaredConstructors();
			for(Constructor<?> field :ff){
				System.out.println("Constructor :" + field.getName());
				
			}
		}
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------All methods-----------------------");
			Method[] ff = obj.cls.getMethods();
			for(Method field :ff){
				System.out.println("Method :" + field.getReturnType() +" " +field.getName());
				
			}
		}
		
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Class methods---------------------");
			Method[] ff = obj.cls.getDeclaredMethods();
			for(Method field :ff){
				System.out.println("Method :" + field.getReturnType() +" " +field.getName());
				
			}
		}
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Super Class-----------------------");
			Class<?> ff = obj.cls.getSuperclass();
			System.out.println("Modifier :" + ff.getModifiers() + " Class Name :" + ff.getName() );
		}
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Super Class Constructor-------------");
			Constructor[] ff = obj.cls.getSuperclass().getDeclaredConstructors();
			for(Constructor<?> field :ff){
				System.out.println("Constructor :" + field.getName());
				
			}
		}
		
		for(ClassMethodField obj : clsArr){
			System.out.println("-------------------Class methods---------------------");
			Method[] ff = obj.cls.getSuperclass().getDeclaredMethods();
			for(Method field :ff){
				System.out.println("Method :" + field.getReturnType() +" " +field.getName());
				
			}
		}
		
		Class<?> modifiers_varaibe = Class.forName("java.lang.reflect.Modifier");
		System.out.println("-------Declared Fields of Modifier Class-------------------");
		Field[] field =modifiers_varaibe.getDeclaredFields();
		for(Field temp :field){
			System.out.println("Modifier sum = " + temp.getModifiers()  + " : " + temp.getName() );
		}
		
		Class<?> set = Class.forName("java.util.HashSet");
		System.out.println("-------Implemented Interface of HashSet--------------------");
		Class[] hashset = set.getInterfaces();
		for(Class<?> temp :hashset){
			System.out.println("Implemented Interface = " + temp.getName() );
		}
	}
}
