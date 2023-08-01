package strings;

public class IntroToStrings {
    //Classes pascal case, variables and methods are camel cased
    
    //the access level is default, accessible within this class and the package
    //the absence of a modifier keyword makes it default
    public String helloString = "Hello Everyone!";
    
    private String privateString = "1,2,3 you can't see me";

    public static int attendance = 61;
    //static is called on the class

    public int stringCount(String input){
        return input.length();
    }
}
