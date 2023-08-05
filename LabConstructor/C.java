package LabConstructor;

public class C extends B {
    public C(String argument){
        super(argument);
    }
    public static void main(String[] args){
        A a = new A("These nuts!");
        B b = new B("Bad Bitch!");
        C c = new C("There are hoes in this house!");
    }
}
