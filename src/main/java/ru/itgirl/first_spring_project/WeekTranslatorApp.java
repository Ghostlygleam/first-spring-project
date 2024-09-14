package ru.itgirl.first_spring_project;

import java.util.Scanner;

public class WeekTranslatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели на английском: ");
        String day = scanner.nextLine().toUpperCase();

        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);
            System.out.println("Название дня недели на русском: " + dayOfWeek.getRussianName());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: день недели не распознан!");
        }

        scanner.close();
    }
}
