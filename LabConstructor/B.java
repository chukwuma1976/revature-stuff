package LabConstructor;

public class B extends A {
    public B(){
        System.out.println("No arguments to B");
    }
    public B(String argument){
        super(argument);
    }
    public static void main (String[] args){
        B first = new B();
        B second = new B("Bad bitch!");
    }    
}
