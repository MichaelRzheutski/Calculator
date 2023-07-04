package negativeTests.doubles;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;

public class DoublesNegativeDivisionTest {
    @DataProvider
    public Object[][] dataProviderNegativeDecimalDivision() {
        return new Object[][]{
                {"300348,546", "/", "Test"},
                {"689934,3478", "/", "Test"},
        };
    }

    @Test(dataProvider = "dataProviderNegativeDecimalDivision")
    public void calculateNegativeDecimalDivision(
            String doubleString1, String sign, String doubleString2
    ) {
        double number1;
        double number2;
        double doubleResult = 0.0;
        double tempResult;
        int intResult;
        char operation;

        Scanner num1 = new Scanner(doubleString1);
        while (true) {
            System.out.println("Введите первое целое либо дробное с разделителем (,) число:");
            if (num1.hasNextDouble()) {
                number1 = num1.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 1. Перезапустите программу!");
                break;
            }
            num1.close();

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
            operationSign.close();

            System.out.println("Введите второе целое либо дробное с разделителем (,) число:");
            Scanner num2 = new Scanner(doubleString2);
            if (num2.hasNextDouble()) {
                number2 = num2.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 2. Перезапустите программу!");
                break;
            }
            num2.close();

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
            confirmationAnswer.close();
        }
        Assert.assertEquals(
                doubleResult, 0,
                "Actual result is: " + doubleResult
        );
        System.out.println();
    }

    @DataProvider
    public Object[][] dataProviderNullDivision() {
        return new Object[][]{
                {"83,34", "/", null},
        };
    }

    @Test(
            dataProvider = "dataProviderNullDivision",
            expectedExceptions = {NullPointerException.class}
    )
    public void calculateNullDivision(
            String doubleString1, String sign, String doubleString2
    ) {
        double number1;
        double number2;
        double doubleResult = 0.0;
        double tempResult;
        int intResult;
        char operation;

        Scanner num1 = new Scanner(doubleString1);
        while (true) {
            System.out.println("Введите первое целое либо дробное с разделителем (,) число:");
            if (num1.hasNextDouble()) {
                number1 = num1.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 1. Перезапустите программу!");
                break;
            }
            num1.close();

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
            operationSign.close();

            System.out.println("Введите второе целое либо дробное с разделителем (,) число:");
            Scanner num2 = new Scanner(doubleString2);
            if (num2.hasNextDouble()) {
                number2 = num2.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число 2. Перезапустите программу!");
                break;
            }
            num2.close();

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
            confirmationAnswer.close();
        }
        Assert.assertEquals(
                doubleResult, 0.0,
                "Actual result is: " + doubleResult
        );
        System.out.println();
    }
}
