package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int start) {

        int a = 0;
        int b = -1;

        for (int i = 0; i < days; i++) {
            for (int j = 1; j < start && i == 0; j++) {
                System.out.print("   ");
                b++;
            }
            b++;
            a++;
            if (b % 7 == 0) {
                System.out.println();
            }
            System.out.printf("%2d ", a);
        }
        System.out.println();
    }

    public static long[] lcg(long seed) {
        long[] randomNumbers = new long[10]; //array mit 10 zeichen
        double m = Math.pow(2, 31); //modul
        long mNeu = (long) m; //Modul typcast
        final long A = 1103515245; //Faktor
        final int C = 12345; //Inkrement
        for (int i = 0; i < randomNumbers.length; i++) {
            seed = (seed * A + C) % mNeu;
            randomNumbers[i] = seed;
        }

        return randomNumbers; //da ich hier noch kein array habe
        // bei nicht void Methoden braucht man ein return
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        return random.nextInt(100) + 1;

    }

    public static void guessingGame(int numberToGuess) {

        //int random = this.randomNumberBetweenOneAndHundred();

        Scanner scanner = new Scanner(System.in);


        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Guess number " + counter + ": ");
            int number = scanner.nextInt();

            if (counter == 10 && number != numberToGuess) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            }

            if (number > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (number < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");

            } else {
                System.out.println("You won wisenheimer!");
                return;
            }



        }


    }

    public static boolean swapArrays(int [] array1, int [] array2){
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++){
            int temporary = array1[i];
            array1[i] = array2 [i];
            array2[i] = temporary;
        }

        return true;

    }

    public static String camelCase(String conToCamel){
        conToCamel = conToCamel.substring(0, 1).toUpperCase() + conToCamel.substring(1).toLowerCase();
        StringBuilder builder = new StringBuilder(conToCamel);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '!'|| builder.charAt(i) == '.'){
                builder.deleteCharAt(i);
            } else if (builder.charAt(i) == '\'') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, String.valueOf(builder.charAt(i)));
            } else if (builder.charAt(i) == ' ') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, String.valueOf(Character.toUpperCase(builder.charAt(i))));

        }
    }

return builder.toString();
}

    public static int checkDigit(int [] numbers){
        int [] gewichtung = new int[numbers.length];
        int [] produkt = new int[numbers.length];
        int sum = 0;
        int reminder;
        int checkDigit;

        for (int i = 0; i < numbers.length; i++){
            gewichtung [i] = i +2;
            produkt [i] = numbers [i] * gewichtung[i];
            sum = sum + produkt [i];
        }

        reminder = sum % 11;

        checkDigit = 11 - reminder;

        if (checkDigit == 10){
            checkDigit = 0;
        } else if (checkDigit == 11) {
            checkDigit = 5;
        }

        return checkDigit;



    }

    // Implement all methods as public static

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1: one month calendar");
        System.out.println();
        System.out.print("Start: ");
        int start = scanner.nextInt();
        System.out.print("Days: ");
        int days = scanner.nextInt();
        oneMonthCalendar(days, start);


        System.out.println("Task 3: Guessing Game");
        System.out.println();
        guessingGame(randomNumberBetweenOneAndHundred());


        System.out.println();
        System.out.println();
        System.out.println("Task 3: Swap Arrays");

        int [] array1 = {1,2,3,4};
        int [] array2 = {4,3,2,1};
        System.out.println();
        System.out.println("Before Swap:");
        System.out.println("Array1 => "+ java.util.Arrays.toString(array1));
        System.out.println("Array2 => "+ java.util.Arrays.toString(array2));
        System.out.println();

       swapArrays(array1, array2);
        System.out.println("After Swap:");
        System.out.println("Array1 => "+ java.util.Arrays.toString(array1));
        System.out.println("Array2 => "+ java.util.Arrays.toString(array2));


        System.out.println("Task 5: camelcase");
        System.out.println();
        System.out.print("Convert into camelcase: ");
        Scanner scr = new Scanner(System.in);
        String convertToCamelCase = scr.nextLine();
        camelCase(convertToCamelCase);
        System.out.println(camelCase(convertToCamelCase));
        System.out.println();


        System.out.println("Task 6: check digit");
        System.out.println();
        System.out.print("Array: ");
        int [] numbers = {5, 4, 4, 1, 3, 8, 1,};
        System.out.println(java.util.Arrays.toString(numbers));

        System.out.print("Prüfziffer: ");
        checkDigit(numbers);
        System.out.println(checkDigit(numbers));







        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }


}