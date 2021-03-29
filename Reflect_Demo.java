package com.test.Reflect;

import java.lang.reflect.Method;

public class Reflect_Demo {
    public int add(int a,int b){
        return  a+b;
    }
    public String echo(String Message){
        return "Hello"+Message;
    }

    public static void main(String[] args) throws Exception{
        Class<?> classType = Reflect_Demo.class;
        Object  newAnimal = classType.newInstance();
        System.out.println(newAnimal instanceof Reflect_Demo);
        Method addMethod = classType.getMethod("add", int.class, int.class);
        Object result = addMethod.invoke(newAnimal, 10,20);
        System.out.println(result);

    }
}
