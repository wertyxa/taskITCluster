import java.util.Scanner;
/*
Задача 2
        Напишіть програму, яка зчитує символи поки не зустрінеться крапка.

        Також передбачте вивід кількості пропусків.
        */

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введіть текст >>");
        Scanner input = new Scanner(System.in);

        String text= input.nextLine();
        int i=text.indexOf(".");
        System.out.println("Кількість символів до крапки:"+i);

        int allText = text.length();
        int charText = text.replaceAll("[ ]", "").length();
        System.out.println("Кількість пропусків в тексті " + (allText - charText));
    }
}
