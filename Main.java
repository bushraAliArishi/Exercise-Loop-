import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myNumber;
        int count = 1;
        int myTextLength = 0;
        boolean go=true;
        double fofNumber = 1;
        double result = 1;
        boolean prime = true;

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  1\n    ********************************************************");

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
//                If the number is a multiple of 5, you need to print "Buzz" instead of that
//        number.
//                If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//        instead of that number

        while (count <= 100) {
            if (count % 5 == 0 && count % 10 == 0 && count % 3 == 0) {
                System.out.printf(" FizzBuzz\n");
            } else if (count % 5 == 0 && count % 3 == 0) {
                System.out.printf(" FizzBuzz");
            } else if (count % 5 == 0 && count % 10 == 0) {
                System.out.printf(" Buzz\n");
            } else if (count % 5 == 0) {
                System.out.printf(" Buzz");
            } else if (count % 3 == 0) {
                System.out.printf(" Fizz");
            } else System.out.printf(" " + count);
            count++;

        }

        System.out.println("");


        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  2\n    ********************************************************");
//        2.Write a Java program to reverse a string.
//        Test Data:
//        Input a string: The quick brown fox
//        Expected Output: Reverse
//        string: xof nworb kciuq ehT
        String myText = "";

        System.out.printf("enter yor text : ");
        myText = input.nextLine();

      while (go){
        if (myText.matches("[0-9]+")) {
            System.out.println("you Enter a number \ntry enter a text agin : ");
            myText = input.nextLine();
        }
        else {go=false;

            myTextLength = myText.length();
            while (myTextLength != 0) {
                System.out.printf("" + myText.charAt(myTextLength - 1));
                myTextLength--;

            }}
        }
        System.out.printf("\n");

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  3\n    ********************************************************");
//        3.Write a program to find the factorial value of any number entered
//        through the keyboard

                System.out.println("Enter any number: ");
                myNumber = input.nextInt();
                count = myNumber;

                while (count >= 1) {
                    // System.out.println(count+" the result of "+fofNumber+" * "+count+" = "+(fofNumber*count));
                    fofNumber = fofNumber * count;
                    count--;
                }
                System.out.println("Factorial Number of " + myNumber + " is: " + fofNumber);

        System.out.println("");


        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  4\n    ********************************************************");
//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)
        System.out.print("Enter the  number: ");
        myNumber = input.nextInt();

        System.out.print("Enter the exp: ");
        fofNumber = input.nextInt();


        count = 1;
        do {
            result *= myNumber;
            count++;
        } while (count <= fofNumber);
        System.out.println(myNumber + " raised to the power of " + fofNumber + " is: " + result);
        System.out.println("");

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  5\n    ********************************************************");
//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.
        double sumE = 0;
        double sumO = 0;
        double inUser = 1;
        System.out.printf("start program if you want to End  and see the total enter 0\n");

        while (inUser != 0) {
            System.out.printf("enter a number ");
            inUser = input.nextDouble();
            if (inUser % 2 == 0)
                sumE = inUser + sumE;
            else sumO = inUser + sumO;

        }
        System.out.printf("the total for even number = " + sumE + " the total for odd number = " + sumO);
        System.out.println("");

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  6\n    ********************************************************");
//        6.Write a program that prompts the user to input a positive integer.
//        It
//        should then output a message indicating whether the number is a prime
//        number.
        count = 2;


        System.out.printf("Enter a number: ");
        inUser = input.nextInt();

        while (count <= inUser / 2) {
            if (inUser % count == 0) {
                prime = false;
                break;
            } else if (count < 1) {
                prime = false;
                continue;

            }
            count++;
        }

        if (prime) {
            System.out.printf(inUser + " is a prime number ");
        } else {
            System.out.println(inUser + " is not a prime number");
        }
        System.out.println("");
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  7\n    ********************************************************");
//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//        Day2
//        Day3
//        Day4
//        Day5
//        Day6
//        Day7
//        Week 2
//        Day1
//        Day2
        for (int i = 1; i < 5; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("Day" + j);
            }
        }

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  8\n    ********************************************************");
//        8.Write a program thats check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.
        System.out.print("Enter a word: ");
        myText = input.next();

            prime = true;
            int length = myText.length();
            for (int i = 0; i < length / 2; i++) {
                if (myText.charAt(i) != myText.charAt(length - i - 1)) {
                    prime = false;
                    continue;
                }
            }

            // Output the result
            if (prime) {
                System.out.println(myText + " is a palindrome.");
            } else {
                System.out.println(myText + " is not a palindrome.");
            }
        }
    }
