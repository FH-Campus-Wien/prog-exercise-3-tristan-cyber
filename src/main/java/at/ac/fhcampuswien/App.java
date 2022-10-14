package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int start) {
        //modulo operator um nach 7 zeilenumbruch zu machen
        //mit if kann man zwei stellige zahlen machen damit vor einstelligen ein abstand ist
        //oder printf

        // Beispiel 2 mit array lösen

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

    // Implement all methods as public static

    public static void main(String[] args) {

        /*
       Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int start = scanner.nextInt();
        int test = 1;
        oneMonthCalendar(days,start); //da methode void ist hat sie keinen Output
        guessingGame(test);
        long [] randomNumbers = lcg(0); //Methodenaufruf // was die Methode zrückliefert
        // steht dann in der Methode random Numbers

*/

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


        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }


}