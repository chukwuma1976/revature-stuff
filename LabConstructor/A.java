package LabConstructor;

public class A {
    public A(){
        System.out.println("No arguments to A");
    }
    public A(String argument){
        System.out.println(argument);
    }
    public static void main (String[] args){
        A first = new A();
        A second = new A("These nuts!");
    }
}
