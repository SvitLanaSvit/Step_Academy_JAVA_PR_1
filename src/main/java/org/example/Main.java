package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1 task = new Task1();

        //1
        System.out.println(task.showString());
        //2
        System.out.println(task.showNumbers());
        //3
        System.out.println(task.getNumberForward());
        //4
        System.out.println(task.getAnswerByTime());
        //5
        System.out.println(task.getLuckyNumber());
        //6
        System.out.println(task.getAnswerByNumber());
        //7
        System.out.println(task.getFactorial());
        //8
        System.out.println(task.getPrimeNumbers());
        //9
        System.out.println(task.getSumAverageFromArray());
        //10
        System.out.println(task.getCountOfNumberInArray());
        //11
        System.out.println(task.calculateSumInRange());
        //12
        System.out.println("Factorial in massive of each element:");
        int[] arr = {1,2,3,4,5};
        var arrFactorial = task.getFactorialEachNumberOfArray(arr);
        Arrays.stream(arrFactorial).forEach(elem -> System.out.print(elem + " "));
    }
}