package playground;

import strings.IntroToStrings;

public class App {
    public static void main (String[] args){
        IntroToStrings newString = new IntroToStrings();
        String welcome = newString.helloString;
        newString.stringCount(welcome);
        System.out.println(newString.stringCount(welcome));
        System.out.println(welcome);
        String hello = "Hello Everyone!";
        String hello2 = new String("Hello Everyone!");
        System.out.println(hello);
        System.out.println(hello.equals(welcome));
        System.out.println(welcome==hello2);
        for (char letter='A';letter <= 'Z'; letter++){
            System.out.print(letter);
          }
    }
}
