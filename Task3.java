//В калькулятор добавьте возможность отменить последнюю операцию.
//Пример
//1 + 2
//ответ:
//3
//+
//4
//ответ:
//7
//+
//2
//ответ:
//9
//1
//Ответ 8
//Отмена -> 9
//Отмена -> 7
//Отмена -> 3
//+
//2
//Ответ 5



import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] results = new double[100]; 
        int index = 0; 
        System.out.print("Введите первое число: ");
        double num1 = Double.parseDouble(scan.nextLine());
        while (true) {
            System.out.print("Введите оператор (+, -, *, /)  'u' - отмена действия,  или 'q' для выхода: ");
            String operator1 = scan.nextLine();
            if (operator1.equals("q")) {
                System.out.println("Работа программы завершена");
                break;
            } else if (operator1.equals("u")) {
                if (index > 0) {
                    index--;
                    num1 = results[index];
                    System.out.println("Отменено. Предыдущий ответ: " + num1);
                } else {
                    System.out.println("Нет предыдущих результатов.");
                }
                continue;
            }
            System.out.print("Введите второе число: ");
            double num2 = Double.parseDouble(scan.nextLine());

            double result = 0.0;
            if (operator1.equals("+")) {
                result = num1 + num2;
            
            } else if (operator1.equals("-")) {
                result = num1 - num2;
              
            } else if (operator1.equals("*")) {
                result = num1 * num2;
            } else if (operator1.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль");

                } else {
                    result = num1 / num2;
                 
                }
            } else {
                System.out.println("Неверный оператор");
                continue;
            }
            results[index] = result; 
            index++; 
            System.out.println("Ответ: " + result);
            num1 = result;
        }
    }
}