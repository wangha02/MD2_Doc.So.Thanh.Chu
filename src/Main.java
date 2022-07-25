import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can dich");
        int number = scanner.nextInt();
        if (0 <= number && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        if (10 <= number && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
            }
        } else {
            String unit = "";
            switch (number % 10) {
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
            System.out.println(unit + "teen");
        }
        if (20 <= number && number < 100) {
            String dozens = "";
            String hundred = "";
            switch (number / 10) {
                case 2:
                    dozens = "twenty";
                    break;
                case 3:
                    dozens = "thirty";
                    break;
                case 4:
                    dozens = "forty";
                    break;
                case 5:
                    dozens = "fifty";
                    break;
                case 6:
                    dozens = "sixty";
                    break;
                case 7:
                    dozens = "seventy";
                    break;
                case 8:
                    dozens = "eighty";
                    break;
                case 9:
                    dozens = "ninety";
                    break;
            }
            switch (number % 10) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
            System.out.println(dozens + hundred);
        }
        if (100 < number && number < 1000) {
            String hundred2 = "";
            switch (number / 100) {
                case 1:
                    hundred2 = "one hundred";
                    break;
                case 2:
                    hundred2 = "two hundred";
                    break;
                case 3:
                    hundred2 = "three hundred";
                    break;
                case 4:
                    hundred2 = "four hundred";
                    break;
                case 5:
                    hundred2 = "five hundred";
                    break;
                case 6:
                    hundred2 = "six hundred";
                    break;
                case 7:
                    hundred2 = "seven hundred";
                    break;
                case 8:
                    hundred2 = "eight hundred";
                    break;
                case 9:
                    hundred2 = "nine hundred";
                    break;
            }
            int number2 = number % 100;
            String dozen2 = "";
            String unit2 = "";
            if (number2 / 10 == 1) {
                switch (number2 % 10) {
                    case 0:
                        dozen2 = "ten";
                        break;
                    case 1:
                        dozen2 = "eleven";
                        break;
                    case 2:
                        dozen2 = "twelve";
                        break;
                    case 3:
                        dozen2 = "thirteen";
                        break;
                    case 4:
                        dozen2 = "forteen";
                        break;
                    case 5:
                        dozen2 = "fifteen";
                        break;
                    case 6:
                        dozen2 = "sixteen";
                        break;
                    case 7:
                        dozen2 = "seventeen";
                        break;
                    case 8:
                        dozen2 = "eighteen";
                        break;
                    case 9:
                        dozen2 = "nineteen";
                        break;
                }
                System.out.println(hundred2 + "" + dozen2);
            } else {
                switch (number2 / 10) {
                    case 2:
                        dozen2 = "twenty";
                        break;
                    case 3:
                        dozen2 = "thirty";
                        break;
                    case 4:
                        dozen2 = "forty";
                        break;
                    case 5:
                        dozen2 = "fifty";
                        break;
                    case 6:
                        dozen2 = "sixty";
                        break;
                    case 7:
                        dozen2 = "seventy";
                        break;
                    case 8:
                        dozen2 = "eighty";
                        break;
                    case 9:
                        dozen2 = "ninety";
                        break;
                }
                switch (number2 % 10) {
                    case 1:
                        unit2 = "one";
                        break;
                    case 2:
                        unit2 = "two";
                        break;
                    case 3:
                        unit2 = "three";
                        break;
                    case 4:
                        unit2 = "four";
                        break;
                    case 5:
                        unit2 = "five";
                        break;
                    case 6:
                        unit2 = "six";
                        break;
                    case 7:
                        unit2 = "seven";
                        break;
                    case 8:
                        unit2 = "eight";
                        break;
                    case 9:
                        unit2 = "nine";
                        break;
                }
                System.out.println(hundred2 + "" + dozen2 + "" + unit2);
            }
        }
        if (number < 0 || number >= 1000) {
            System.out.println("I don't now");
        }
    }
}