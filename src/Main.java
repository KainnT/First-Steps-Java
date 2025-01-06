import javax.security.auth.Subject;
import java.lang.classfile.constantpool.IntegerEntry;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    /* static is to allow the variable in main to work in method */
    /* A static variable can only work with static methods */
    static int age2 ; /* If not assign a value to the variable in main, Java will assign a default one = 0 */

    public static void main(String[] args) {

        //OOP JAVA

        //Calling the class user on a variable
        user user = new user("Axel Salas", "2002-01-31");


        books books = new books("The man inside me","Tobias", 200);
        AudioBook Dracula = new AudioBook("Dracula", "Someone", 3000);
        Ebook Jeeves = new Ebook("Carry on Jeeves", "P.G", 300, "PDF");
        System.out.println(Jeeves.toString());
        System.out.println(Dracula.toString());



        // Next to learn: Overloading, over writing, abstract method



        user.borrow(books);
        // Printing
        System.out.printf("%s was born in %s, So he is %d old \n", user.getName(), user.getBirthDay(),  user.age());


        System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrowed());





        //===============================================================================================================

        // BASICS OF THE LANGUAGE

        /*
        // declare a value of a new variable
        int age = 23;
        //redeclare a new value of a variable
        age = 234;
        System.out.println("Im " + age +" old");
        System.out.println("Im " + age2 +" old");
        //--------------------------------------------------------------

        double dec = 23.4; //     decimal numbers
        int age1 = 21; //     int numbers
        System.out.println(age1 >= 18 && age1 <= 34); //       && = and
        //--------------------------------------------------------------

        boolean isStudent = false;
        boolean isMember = true;
        System.out.println(isStudent || isMember); //        || = or

        boolean bool = false;
        System.out.println(!bool);//        ! = not
        //--------------------------------------------------------------

        int sum = 0;
        int min = 10;
        sum++; // sums 1
        min--; // subtract 1
        //--------------------------------------------------------------
        // Here the compiler see the variables as the same
        String name = "Axel Alvarado";
        String name1 = "Axel Alvarado";

        // Here is sees the variables as different because of the New String() function
        String namesother = new String("Alvarado Axel");
        String namesother1 = new String("Alvarado Axel");


        System.out.print(name == name1); //Re True
        System.out.print(namesother == namesother1); //Re False
        //--------------------------------------------------------------

        int ageme = 22; // %d for int
        String country = "CR"; //%s for string
        double gpa = 3.4; // %f for double or float
        char PercentSign = '%'; // %c for unique signs
        boolean truthornot = false; // %b for boolean

        String formattedString = String.format("Im %d. I am from %s. I have gpa of %f and 100%c of the class. This is a %b claim", ageme, country, gpa, PercentSign, truthornot);
        System.out.print(formattedString);
        //--------------------------------------------------------------

        // User Inputs

        Scanner scaner = new Scanner(System.in); // To use this I have to import the module

        System.out.print("What is your name"); // print doesnt add to the next line, instead in the same one of the output
        String name = scaner.nextLine(); // Ask for string
        System.out.println(name);
        System.out.printf("Hello how are you %s, ur age is?", name);
        int age = scaner.nextInt(); // Ask for int
        System.out.printf(" ur age is %s", age);
        scaner.close();
        //--------------------------------------------------------------

        // Conditional statements
        Scanner scanner = new Scanner(System.in); // To use this I have to import the module

        System.out.print("first number"); // print doesnt add to the next line, instead in the same one of the output
        double number1 = scanner.nextDouble();
        System.out.print("second number"); // print doesnt add to the next line, instead in the same one of the output
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("What operation you want to perform"); // print doesnt add to the next line, instead in the same one of the output
        String operation = scanner.nextLine();

        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "div":
                if (number2 == 0){
                    System.out.println("dont divide by zero");

                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                    break;
            default:
                System.out.printf("This is not an operation %s", operation);
        }

        if (operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);

        } else if (operation.equals("div")) {
            if (number2 == 0){
                System.out.println("dont divide by zero");

            } else{
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);

            }
        } else {
            System.out.printf("This is not an operation %s", operation);

        }

        scanner.close();
        //--------------------------------------------------------------

        // Arrays
        char vowels[] = {'a','x','e','u','o'};

        vowels[4] = 'i'; // Changing a value of the list based on the index
        Arrays.sort(vowels); // It sorts the Array
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length); // know the length of a list

        char vowels2[] = {'a','x','e','u','o'};

        int start = 1;
        int finish = 3;
        Arrays.sort(vowels2, start, finish);
        System.out.println(Arrays.toString(vowels2));



        //--------------------------------------------------------------

        // Loops
        // for
        for( int numer = 1; numer <= 10; numer++) {
            System.out.println(numer);

        }
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int index = 1; index <= number.length; index++) {
            System.out.println(number[index]);

            }

        for( int numer = 1; numer <= 50; numer++) {
            if (numer % 2 == 1){
                System.out.println(numer);

            }
        }

        // While

        int number = 5;
        int multiplier = 1;

        while (multiplier <= 10){

            System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);

            multiplier++;
        }


        // Do While

        do{
            System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);

            multiplier++;
        } while (multiplier<= 10);


        //--------------------------------------------------------------

        // ArrayList import java.util.ArrayList;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add a value
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(10);
        numbers.add(7);
        numbers.add(2);
        numbers.add(8);

        // sustitute an value based on the index
        numbers.set(0, Integer.valueOf(20));
        //remove by index
        numbers.remove(2);
        //remove by value
        numbers.remove(Integer.valueOf(1));

        //Sort methods
        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());

        System.out.println(numbers.get(2));

        // for loop in ArrayList
        numbers.forEach(number -> {
            System.out.println(number* 2);
        });


        //remove all
        //numbers.clear();

        //--------------------------------------------------------------

        // HashMaps

        HashMap<String, Integer> examScore = new HashMap<String, Integer>();
        examScore.put("Math", 20);
        examScore.put("English", 50);
        examScore.put("Psyc", 30);
        // Add it if it doesnt exists
        examScore.putIfAbsent("History", 70);
        // Replace a value
        examScore.replace("History", 40);
        // Print the whole
        System.out.println(examScore.toString());
        // Print value
        System.out.println(examScore.get("Psyc"));
        // Remove one
        examScore.remove("Math");
        // Check if exists
        System.out.println(examScore.containsKey("Math"));
        System.out.println(examScore.containsValue(100));
        // Clear it all
        examScore.clear();
        //Get size
        System.out.println(examScore.size());

        examScore.forEach((subject, grade) ->{
            examScore.replace(subject, grade-10);
        });
        System.out.println(examScore.toString());
        */
    }

}




