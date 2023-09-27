package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    private StringBuilder sb;

    //Завдання 1:
    //Вивести на екран надпис Fall seven times and stand up eight у різних рядках. Приклад виводу:
    //Fall seven times
    //and
    //stand up eight
    public String showString() {
        String str = "Fall \nseven times \nand stand up eight";
        return str;
    }

    //Завдання 2:
    //Користувач вводить з клавіатури два числа. Необхідно порахувати суму чисел, різницю чисел,
    //добуток чисел. Результат підрахунків вивести на екран.
    public String showNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float b = scanner.nextFloat();
        var sum = getSum(a, b);
        var diff = getDifferent(a, b);
        var multi = getMulti(a, b);
        return "Sum: " + sum + "; Different: " + diff + "; Multi: " + multi;
    }

    private float getSum(float a, float b) {
        return a + b;
    }

    private float getDifferent(float a, float b) {
        return a - b;
    }

    private float getMulti(float a, float b) {
        return a * b;
    }

    //Завдання 3:
    //Користувач з клавіатури вводить чотиризначне число. Необхідно повернути число і відобразити
    //результат. Наприклад, якщо вводимо 4512, результат 2154.
    public String getNumberForward() {
        Scanner scanner = new Scanner(System.in);
        sb = new StringBuilder();
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        sb.append(number);
        sb.reverse();
        return sb.toString();
    }

    //Завдання 4:
    //Користувач з клавіатури вводить кількість годин. Якщо отримане значення знаходиться в
    //діапазоні від 0 до 6 потрібно вивести надпис Good Night, якщо в діапазоні від 6 до 13 Good
    //Morning, якщо в діапазоні від 13 до 17 Good Day, якщо в відапазоні від 17 до 0 Good Evening.
    //Верхня межа діапазону не включається. Наприклад, число 6 відноситься від 6 до 13.
    public String getAnswerByTime() {
        Scanner scanner = new Scanner(System.in);
        String night = "Good Night";
        String morning = "Good Morning";
        String day = "Good Day";
        String evening = "Good Evening";
        System.out.print("Enter please number of hour(s)(0-24): ");
        int hour = scanner.nextInt();
        if (hour >= 0 && hour < 6) {
            return night;
        } else if (hour >= 6 && hour < 13) {
            return morning;
        } else if (hour >= 13 && hour < 17) {
            return day;
        } else if (hour >= 17 && hour < 24) {
            return evening;
        } else {
            return "Enter number from 0 to 24";
        }
    }

    //Завдання 5:
    //Користувач вводить з клавіатури ціле шестизначне число. Написати програму, яка визначає, чи є
    //введене число — щасливим (щасливим вважається шестизначне число, у якого сума перших 3
    //чисел рівна сумі других трьох чисел).
    //2
    //Наприклад, 123321 — щасливе число, тому що 1+2+3 = 3+2+1.
    //З іншого боку 378423 нещасливе число, тому що 3+7+8 != 4+2+3
    //Якщо користувач ввів не шестизначне число, потрібно вивести повідомлення про помилку
    public String getLuckyNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a six-digit number: ");
        int number = scanner.nextInt();

        if (isSixDigitNumber(number)) {
            // Extract digits
            int digit6 = number % 10;
            int digit5 = (number / 10) % 10;
            int digit4 = (number / 100) % 10;
            int digit3 = (number / 1000) % 10;
            int digit2 = (number / 10000) % 10;
            int digit1 = (number / 100000) % 10;

            if (digit1 + digit2 + digit3 == digit4 + digit5 + digit6) {
                return number + " is a lucky number!";
            } else {
               return number + " is an unlucky number.";
            }
        } else {
            return "Error: Please enter a six-digit number.";
        }
    }

    private static boolean isSixDigitNumber(int number) {
        return number >= 100000 && number <= 999999;
    }

    //Завдання 6:
    //Користувач вводить з клавіатури число в діапазоні від 1 до 100. Якщо число кратне 3(ділиться на
    //3 без залишку) потрібно вивести слово Fizz. Якщо число кратне 5 потрібно вивести слово Buzz.
    //Якщо число кратне і 3 і 5 потрібно вивести Fizz Buzz. Якщо число не кратне 3 і 5 потрібно вивести
    //саме число.
    //Якщо користувач ввів значення не в діапазоні від 1 до 100 потрібно вивести повідомлення про
    //помилку.
    public String getAnswerByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-100): ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
               return "Buzz";
            } else {
                return String.valueOf(number);
            }
        } else {
           return "Error: Please enter a number between 1 and 100.";
        }
    }

    //Завдання 7:
    //Користувач вводить з клавіатури число. Потрібно порахувати факторіал числа. Наприклад, якщо
    //введене число 3, факторіал числа 1*2*3=6.
    //Формула для розрахунку факторіала: n! = 1*2*3…*n, де n - число для підрахунку факторіалу.
    public int getFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        return factorial(num);
    }

    private int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    //Завдання 8:
    //Показати на екрані всі прості числа в діапазоні, вказаному користувачем. Число називається
    //простим, якщо воно ділиться без залишку тільки на себе і на одиницю. Наприклад, три — це
    //просте число, а чотири — ні.
    public String getPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        sb = new StringBuilder();
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isPrime(number)) {
                sb.append(number).append(" ");
            }
        }
        return sb.toString();
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    //Завдання 9:
    //Користувач з клавіатури вводить елементи одновимірного масиву. Необхідно знайти суму
    //елементів масиву, середнє арифметичне, відобразити на екран всі елементи масиву
    public String getSumAverageFromArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Input the elements one by one
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        var sum = getSumFromArray(arr);
        var average = getAverageFromArray(arr);
        return "Sum: " + sum + "; Average: " + average;
    }

    private int getSumFromArray(int[] arr) {
        return Arrays.stream(arr).reduce(0, Integer::sum);
    }

    private double getAverageFromArray(int[] arr){
        return Arrays.stream(arr).average().orElse(0.0);
    }

    //Завдання 10:
    //Користувач з клавіатури вводить елементи одновимірного місиву і деяке число. Необхідно
    //підрахувати скільки разів число зустрічається у масиві.
    public int getCountOfNumberInArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to count occurrences: ");
        int targetNumber = scanner.nextInt();

        int count = 0;
        for (int number : arr) {
            if (number == targetNumber) {
                count++;
            }
        }

        return count;
    }

    //Завдання 11:
    //Написати метод, що повертає суму чисел у вказаному діапазоні. Границі діапазону передаються
    //в якості параметрів.
    public int calculateSumInRange(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter a end number: ");
        int end = scanner.nextInt();
        return calculateSumInRange(start, end);
    }

    private int calculateSumInRange(int start, int end) {
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    //Завдання 12:
    //Написати метод, що підраховує факторіал кожного елемента масиву. Метод повертає новий
    //масив, що містить отримані факторіали
    public Integer[] getFactorialEachNumberOfArray(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(factorial(a));
        }

        return list.toArray(new Integer[0]);
    }
}
