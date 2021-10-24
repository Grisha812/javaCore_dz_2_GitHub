package ru.yandex.dudar_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[][] m = new String[4][4];
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            try {
                int result = Main(m);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println(" Величина размера слишком большая ");
            } catch (MyArrayDataException e) {
                System.out.println(" Не верное значение массива ");

        }
    }

        try {
            System.out.println(goNumber("thatNumb"));
        }
        catch (MyExp e) {
            System.out.println("Получилась ошибка");
        }

    }
    public static int goNumber(String f) {
        try {
            return integer.parseInt(f);
        }
        catch (NumberFormatException e) {
            throw new MyExp("Вышла ошибка, исправте на букву: " + f)
        }
    }
    public class MyExp extends Throwable {}

    class MyArrayDataException extends MyArraySizeException {
//        public MyArraySizeException(String message) {
//            super(message);
//        }


    }
}