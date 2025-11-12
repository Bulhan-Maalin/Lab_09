import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int randTotal = 0;
        int randAverage = 0;
        int randMax = 0;
        int randMin = 100;

        int dataPoints[] = new int[100];

        for (int i = 0; i < 100; i ++) {
            dataPoints[i] = rand.nextInt(100) + 1;
            randTotal += dataPoints[i];
            //Defining randMax by comparing the current number with the previous maximum
            if (dataPoints[i] > randMax) {
                randMax = dataPoints[i];
            }
            //Defining randMin by comparing the current number with the previous minimum
            if (dataPoints[i] < randMin) {
                randMin = dataPoints[i];
            }
        }

        //Defining the average after we know all the data
        randAverage = randTotal/100;

        for (int i = 0; i < 100; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println("\nTotal of all numbers: " + randTotal);
        System.out.println("Average of all numbers: " + randAverage);
        System.out.println("Max value of all numbers: " + randMax);
        System.out.println("Min value of all numbers: " + randMin);


        //END OF TASK 1: STARTING TASK 2
        //______________________________________________________________________________________________________________
        int userInput = InputHelper.getRangedInt(scan, "Please enter a value between 1 and 100: ", 1, 100);
        int numOfTimes = 0;

        for (int i = 0; i < 100; i++) {
            if (userInput == dataPoints[i]) {
                numOfTimes++;
            }
        }
        if (numOfTimes == 1 || numOfTimes == 0) {
            System.out.println(userInput + " was found inside of the sequence of random numbers " + numOfTimes + " time.");
        } else {
            System.out.println(userInput + " was found inside of the sequence of random numbers " + numOfTimes + " times.");
        }

        int userInput2 = InputHelper.getRangedInt(scan, "Please enter a value between 1 and 100: ", 1, 100);
        int location = 0;

        for (int i = 0; i < 100; i++) {
            if (userInput2 == dataPoints[i]) {
                location = i;
                break;
            }
        }
        if (location == 0) {
            System.out.println(userInput2 + " was not found in the sequence of random numbers.");
        } else {
            System.out.println(userInput2 + " was found at array index " + location + ".");
        }
    }
     }
