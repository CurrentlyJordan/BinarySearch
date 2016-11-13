package nyc.c4q;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        guessingGame(newArray, 5);


    }

    public static int guessingGame(int[] startArray, int target) {
        int max = startArray.length - 1;
        int min = 0;
        if (max < min) {
            return -1;
        }
        int guess = recalculate(max, min);
        int result = newGuessingGame(guess, startArray, target, min, max);

        return result;

    }


    public static int newGuessingGame(int guess, int[] startArray, int target, int min, int max) {
        Boolean isGuessRight;


        if (startArray[guess] == target) {
            isGuessRight = null;
        } else if (startArray[guess] > target) {
            isGuessRight = true;
        } else {
            isGuessRight = false;

        }

        if(isGuessRight == null){
            return guess;
        }

        else if (isGuessRight == true) {
            min = guess + 1;
            guess = recalculate(max, min);
            newGuessingGame(guess, startArray, target, min, max);
        }
        else if (isGuessRight == false) {
            max = guess - 1;
            guess = recalculate(max, min);
            newGuessingGame(guess, startArray, target, min, max);
        }
        return guess;

    }


    public static int recalculate(int max, int min) {
        int result = max - min;
        result = result / 2;
        return result;
    }

    public int binarySearch(int[] startArray, int target, int max, int min){
        if(min > max){
            return -1;
        }

        if(startArray)
    }








}
