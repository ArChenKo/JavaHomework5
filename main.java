package HomeWork5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Phonebook book = new Phonebook();
        while (flag) {
            System.out.println(
                    "Выберите пункт меню:\n 1 - добавить абонента или номер,\n 2 - показать все номера,\n 3 - показать отсортированный список,\n 4 - выйти");
            boolean chose = scanner.hasNextInt();
            if (chose) {
                String input = scanner.nextLine();
                switch (input) {
                    case "1":
                        System.out.println("Введите имя и номер телефона через запятую: ");
                        String[] nameAndPhone = scanner.nextLine().trim().split(",");
                        book.addInfo(nameAndPhone);
                        break;
                    case "2":
                        book.showBook();
                        break;
                    case "3":
                        book.sortBook();
                        break;
                    default:
                        System.out.println();
                        System.out.println("До скорой встречи!");
                        flag = false;
                        break;
                }
            } else {
                System.out.println("Ошибка ввода! Нужно ввести цифру от 1 до 4.");
                flag = false;
                scanner.close();
            }
        }
    }
}
