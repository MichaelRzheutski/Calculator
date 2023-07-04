package positiveTests.integers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;

public class IntegersAdditionTest {

    @DataProvider
    public Object[][] dataProviderAddition() {
        return new Object[][]{
                {1, "+", 15},
                {40, "+", 10},
                {1000, "+", 500},
                {0, "+", 1},
                {0, "+", 25},
                {-1, "+", -15},
                {-40, "+", 10},
                {1000, "+", -500},
                {0, "+", -1},
        };
    }

    @Test(dataProvider = "dataProviderAddition")
    public void calculateIntegersAddition(int integer1, String sign, int integer2) {
        double number1;
        double number2;
        double doubleResult;
        double tempResult;
        int intResult = 0;
        char operation;

        Scanner num1 = new Scanner(String.valueOf(integer1));
        while (true) {
            System.out.println("Введите первое целое либо дробное с разделителем (,) число:");
            if (num1.hasNextDouble()) {
                number1 = num1.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 1. Перезапустите программу!");
                break;
            }

            System.out.println("Введите операцию: + - * /");
            Scanner operationSign = new Scanner(sign);
            if (operationSign.hasNext()) {
                Character enteredChar = operationSign.next().charAt(0);
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
            Scanner num2 = new Scanner(String.valueOf(integer2));
            if (num2.hasNextDouble()) {
                number2 = num2.nextDouble();
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

            Scanner confirmationAnswer = new Scanner("no");
            String confirmation = confirmationAnswer.next();
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
        Assert.assertEquals(
                intResult, integer1 + integer2,
                "Actual result is: " + intResult
        );
        System.out.println();
    }
}
