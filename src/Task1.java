
import java.util.Random;
import java.util.Scanner;

public class Task1 {
     /*
         Задача 1
Створіть просту гру засновану на вгадуванні букв.

Користувач повинен вгадати загадану букву A-Z ввівши її в консоль. Якщо користувач вгадав букву програма виведе «Right» і гра закінчиться, якщо ні, то користувач продовжить вводити слово.

(За бажанням) Вивести «You're too low» - якщо користувач ввів букву менше задуманої, «You're too high» - якщо користувач ввів букву більше задуманої.



*/
    public static void main(String[] args)  {



        Scanner input = new Scanner(System.in);

        char litera = (char)('A' + new Random().nextInt(26));

        System.out.println(litera);
        System.out.println("Hello, try to guess the letter!");

        for(char i = 0; i < 26;i ++){
            char s = input.next().charAt(0);

            if(litera==s) {
                System.out.println("Right");
                break;
            } else {
                System.out.println("You loss, try again!");

                if(Character.getNumericValue(litera)>Character.getNumericValue(s)) {
                    System.out.println("You are too low!");
                } else if(Character.getNumericValue(litera)<Character.getNumericValue(s)){
                    System.out.println("You are too high!");
                }
            }
        }


    }
}
