import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        public static void vvod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение (например 1 + 2 или V * III):");
        String xxx = scanner.nextLine();}


        public static void calc() {
            String[] subStr;
            String delimeter = " ";
            subStr = xxx.split(delimeter);
            for (int i = 0; i < subStr.length; i++) {

            }
            int fff = subStr.length;
            if (fff > 3) {
                System.out.println("Неверное значение (более двух операндов)");
                System.exit(0);
            } else {


                int rim1 = 0;
                int rim2 = 0;
                int a = 0;
                int b = 0;

                try {
                    switch (subStr[0]) {
                        case "I":
                            a = 1;
                            rim1 = 1;
                            break;
                        case "II":
                            a = 2;
                            rim1 = 1;
                            break;
                        case "III":
                            a = 3;
                            rim1 = 1;
                            break;
                        case "IV":
                            a = 4;
                            rim1 = 1;
                            break;
                        case "V":
                            a = 5;
                            rim1 = 1;
                            break;
                        case "VI":
                            a = 6;
                            rim1 = 1;
                            break;
                        case "VII":
                            a = 7;
                            rim1 = 1;
                            break;
                        case "VIII":
                            a = 8;
                            rim1 = 1;
                            break;
                        case "IX":
                            a = 9;
                            rim1 = 1;
                            break;
                        case "X":
                            a = 10;
                            rim1 = 1;
                            break;
                        default:
                            rim1 = 0;
                            a = Integer.parseInt(subStr[0]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод");
                    System.exit(0);
                }

                try {
                    switch (subStr[2]) {
                        case "I":
                            b = 1;
                            rim2 = 1;
                            break;
                        case "II":
                            b = 2;
                            rim2 = 1;
                            break;
                        case "III":
                            b = 3;
                            rim2 = 1;
                            break;
                        case "IV":
                            b = 4;
                            rim2 = 1;
                            break;
                        case "V":
                            b = 5;
                            rim2 = 1;
                            break;
                        case "VI":
                            b = 6;
                            rim2 = 1;
                            break;
                        case "VII":
                            b = 7;
                            rim2 = 1;
                            break;
                        case "VIII":
                            b = 8;
                            rim2 = 1;
                            break;
                        case "IX":
                            b = 9;
                            rim2 = 1;
                            break;
                        case "X":
                            b = 10;
                            rim2 = 1;
                            break;
                        default:
                            b = Integer.parseInt(subStr[2]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод");
                    System.exit(0);
                }


                if ((a > 10) || (b > 10)) {
                    System.out.println("Неверное значение (больше 10).");
                    System.exit(0);
                }
                String z = subStr[1];

                // кальк


                int res = 0;
                switch (z) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            System.out.println("Неверная операция (деление на 0)");
                            System.exit(0);
                        }
                        res = a / b;
                        break;
                    default:
                        System.out.println("Неверная операция.");
                        System.exit(0);
                }
                //


                if (rim1 != rim2) {

                    System.out.println("Неверное значение (римские и арабские числа в одном выражении)");
                    System.exit(0);
                }
                //

                if ((rim1 == 1) && (rim2 == 1)) {
                    if (res < 1) {
                        System.out.println("Неверное значение (результат меньше 1)");
                        System.exit(0);
                    } else {

                        switch (res) {

                            case 100:

                                String resRim = "C";
                                System.out.println("Результат: " + resRim);
                                break;

                            default:

                                String resRim10 = "";
                                String resRim1 = "";

                                switch (res / 10) {
                                    case 1:
                                        resRim10 = "X";
                                        break;
                                    case 2:
                                        resRim10 = "XX";
                                        break;
                                    case 3:
                                        resRim10 = "XXX";
                                        break;
                                    case 4:
                                        resRim10 = "XL";
                                        break;
                                    case 5:
                                        resRim10 = "L";
                                        break;
                                    case 6:
                                        resRim10 = "LX";
                                        break;
                                    case 7:
                                        resRim10 = "LXX";
                                        break;
                                    case 8:
                                        resRim10 = "LXXX";
                                        break;
                                    case 9:
                                        resRim10 = "XC";
                                        break;
                                    case 0:
                                        resRim10 = "";
                                        break;
                                    default:
                                        System.out.println();

                                }

                                switch (res % 10) {
                                    case 1:
                                        resRim1 = "I";
                                        break;
                                    case 2:
                                        resRim1 = "II";
                                        break;
                                    case 3:
                                        resRim1 = "III";
                                        break;
                                    case 4:
                                        resRim1 = "IV";
                                        break;
                                    case 5:
                                        resRim1 = "V";
                                        break;
                                    case 6:
                                        resRim1 = "VI";
                                        break;
                                    case 7:
                                        resRim1 = "VII";
                                        break;
                                    case 8:
                                        resRim1 = "VIII";
                                        break;
                                    case 9:
                                        resRim1 = "IX";
                                        break;
                                    case 0:
                                        resRim1 = "";
                                        break;
                                    default:
                                        System.out.println("");

                                }


                                System.out.println("Результат: " + resRim10 + resRim1);
                        }
                    }

                } else {


                    String resAr = Integer.toString(res);

                    System.out.println("Результат: " + resAr);
                }

            }
        }
        }

    }

