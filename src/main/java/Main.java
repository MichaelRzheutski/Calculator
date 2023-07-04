import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        double number1;
        double number2;
        double doubleResult;
        double tempResult;
        int intResult;
        char operation;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите первое целое либо дробное с разделителем (,) число:");
            if (scanner.hasNextDouble()) {
                number1 = scanner.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 1. Перезапустите программу!");
                break;
            }

            System.out.println("Введите операцию: + - * /");
            if (scanner.hasNext()) {
                Character enteredChar = scanner.next().charAt(0);
                if (enteredChar.equals('+')
                        || enteredChar.equals('-')
                        || enteredChar.equals('*')
                        || enteredChar.equals('/')) {
                    operation = enteredChar;
                } else {
                    System.out.println("Ошибка при вводе операции!");
                    break;
                }
            } else {
                System.out.println("Ошибка при вводе операции!");
                break;
            }

            System.out.println("Введите второе целое либо дробное с разделителем (,) число:");
            if (scanner.hasNextDouble()) {
                number2 = scanner.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 2. Перезапустите программу!");
                break;
            }

            switch (operation) {
                case '+':
                    tempResult = number1 + number2;
                    if ((int) tempResult != tempResult) {
                        doubleResult = tempResult;
                        System.out.println("Результат: " + doubleResult);
                    } else {
                        intResult = (int) tempResult;
                        System.out.println("Результат: " + intResult);
                    }
                    break;
                case '-':
                    tempResult = number1 - number2;
                    if ((int) tempResult != tempResult) {
                        doubleResult = tempResult;
                        System.out.println("Результат: " + doubleResult);
                    } else {
                        intResult = (int) tempResult;
                        System.out.println("Результат: " + intResult);
                    }
                    break;
                case '*':
                    tempResult = number1 * number2;
                    if ((int) tempResult != tempResult) {
                        doubleResult = tempResult;
                        System.out.println("Результат: " + doubleResult);
                    } else {
                        intResult = (int) tempResult;
                        System.out.println("Результат: " + intResult);
                    }
                    break;
                case '/':
                    if (number2 == 0) {
                        System.out.println("Ошибка! На 0 делить нельзя");
                        break;
                    }
                    tempResult = number1 / number2;
                    if ((int) tempResult != tempResult) {
                        doubleResult = tempResult;
                        System.out.println("Результат: " + doubleResult);
                    } else {
                        intResult = (int) tempResult;
                        System.out.println("Результат: " + intResult);
                    }
                    break;
                default:
                    System.out.println("Неверная операция. Попытайтесь снова");
            }

            System.out.println("Желаете продолжить? Введите (да/y/yes) (нет/n/no)");

            String confirmation = scanner.next();
            if (confirmation.equalsIgnoreCase("да")
                    || confirmation.equalsIgnoreCase("y")
                    || confirmation.equalsIgnoreCase("yes")) {
                System.out.println("/*** Продолжаем вычисления ***/");
            } else if (confirmation.equalsIgnoreCase("нет")
                    || confirmation.equalsIgnoreCase("n")
                    || confirmation.equalsIgnoreCase("no")) {
                System.out.println("Вычисления завершены!");
                break;
            } else {
                System.out.println("Вычисления завершены!");
                break;
            }
        }
    }

}
