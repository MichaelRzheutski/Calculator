package negativeTests.integers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;

public class IntegersNegativeDivisionTest {

    @DataProvider
    public Object[][] dataProviderZeroDivision() {
        return new Object[][]{
                {150, "/", 0},
        };
    }

    @Test(
            dataProvider = "dataProviderZeroDivision",
            expectedExceptions = {ArithmeticException.class}
    )
    public void calculateZeroDivision(int integer1, String sign, int integer2) {
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
                intResult, integer1 / integer2,
                "Actual result is: " + intResult
        );
        System.out.println();
    }

    @DataProvider
    public Object[][] dataProviderNegativeDivision() {
        return new Object[][]{
                {725, "/", "Test"},
                {-4579, "/", "Test"},
                {2051, "/", null},
        };
    }

    @Test(dataProvider = "dataProviderNegativeDivision")
    public void calculateNegativeDivision(int integer, String sign, String text) {
        double number1;
        double number2;
        double doubleResult;
        double tempResult;
        int intResult = 0;
        char operation;

        Scanner num1 = new Scanner(String.valueOf(integer));
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
            Scanner num2 = new Scanner(String.valueOf(text));
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
                intResult, 0,
                "Actual result is: " + intResult
        );
        System.out.println();
    }

    @DataProvider
    public Object[][] dataProviderTwoStringsDivision() {
        return new Object[][]{
                {"Test", "/", "Test"},
        };
    }

    @Test(dataProvider = "dataProviderTwoStringsDivision")
    public void calculateTwoStringsDivision(String str1, String sign, String str2) {
        double number1;
        double number2;
        double doubleResult;
        double tempResult;
        int intResult = 0;
        char operation;

        Scanner num1 = new Scanner(String.valueOf(str1));
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
            Scanner num2 = new Scanner(String.valueOf(str2));
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
                intResult, 0,
                "Actual result is: " + intResult
        );
        System.out.println();
    }
}
