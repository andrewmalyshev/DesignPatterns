package com.malyshev.patterns.creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("Hello from EnumSingleton!");
    }
}
