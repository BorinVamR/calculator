import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static String calc(String input) {

        return null;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        char operation = 0;
        int result;
        String y = scanner.nextLine();
        char[] input1 = new char[y.length()];
        for (int i = 0; i < y.length(); i++) {
            input1[i] = y.charAt(i);
            if (input1[i] == ',' || input1[i] == '.') { int error = 1/0;
            }
        }
        for (int i = 0; i < y.length(); i++) {
                switch (input1[i]) {
                    case '+':
                        operation = input1[i];
                        break;
                    case '/':
                        operation = input1[i];
                        break;
                    case '-':
                        operation = input1[i];
                        break;
                    case '*':
                        operation = input1[i];
                        break;
                }
        }
        String[] twoOperands = y.split("[+-/*]");
        String num1 = twoOperands[0];
        String num2 = twoOperands[1];
        int num5 = twoOperands.length;
        if (num5 != 2) {
            int error = 1/0;
        }
        String num3 = num1.trim();
        String num4 = num2.trim();
        number1 = romanToNumber(num3);
        number2 = romanToNumber(num4);
        if (number1 > 0 && number2 > 0) {
            result = calculated(number1, number2, operation);
            String resultRoman = convertNumToRoman(result);
            System.out.println(resultRoman);
        } else {
            number1 = parseInt(num3);
            number2 = parseInt(num4);
            if (number1 > 0 && number2 > 0 && number1 < 11 && number2 < 11) {
                result = calculated(number1, number2, operation);
                System.out.println(result);
            }else {
                    int error = 1/0;
                }

        }
    }

    private static int romanToNumber (String roman) {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        return -1;
    }
    public static int calculated (int numb1, int numb2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = numb1 + numb2;
                break;
            case '-':
                result = numb1 - numb2;
                break;
            case '*':
                result = numb1 * numb2;
                break;
            case '/':
                try {
                    result = numb1 / numb2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("нелья делить на 0");

                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
    private static String convertNumToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String x = roman[numArabian];
        return x;
    }
}