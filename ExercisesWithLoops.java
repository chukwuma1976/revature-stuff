class ExercisesWithLoops {
    public static void main (String[] args){
        // // exercise 1
        // byte[] numbers = {1,2,3,4,5,6,7,8,9,10};
        // for (byte number : numbers){
        //     System.out.println(number);
        // }

        // //exercise 2
        // int i = 1;
        // while (i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        // //exercise 3
        // int i = 100;
        // while (i>= -100){
        //     System.out.println(i);
        //     i-=2;
        // }

        // // exercise 4
        // int i = 1;
        // while (i<=49){
        //     System.out.println(i);
        //     i+=2;
        // }

        // // exercise 5
        // String alphabet = "abcdefghijklmnopqrstuvwkyz";
        // int i=0;
        // do {
        //     System.out.println(alphabet.charAt(i));
        //     i++;
        // } while (i<26);

        // // exercise 6 see named method below
        // quadratic(1.1f, 2.2f, 3.3f);

    }

    public static void quadratic(float a, float b, float c){
        float discriminant = (b*b) - (4*a*c);
        if (discriminant > 0){
            System.out.println("Two real-numbered solutions.");
        } else if (discriminant==0){
            System.out.println("One real-numbered solutions.");
        } else {
            System.out.println("Two complex(imaginary) solutions.");
        }
    }
}