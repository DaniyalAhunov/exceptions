import java.util.Scanner;

/*
1. Pеализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код (задание 2 
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
3. Дан следующий код, исправьте его там, где требуется (задание 3
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class DZ_2 {
    //Задание 1
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in); 
    //         while (true) {
    //             try {
    //                 System.out.println("Введите дробное число: ");
    //                 String numS = sc.nextLine();
    //                 Double num = Double.parseDouble(numS);
    //                 System.out.println("Ваше число: " + num);
    //                 break;
    //             }
    //             catch (NumberFormatException e) {
    //                 System.out.println("Число не дробное");
    //                 System.out.println();
    //             }    
    //         }
        
    // }
    //Задание 2
    // Исключение попадает под законы математики исправлять только если само значение d fтк как на 
    // 0 делить нельзя по выходу получаем исключение
    // public static void main(String[] args) {
    //     int[] intArray = {1,2,3,4,5,7,8};
    //     try {
    //         int d = 0;
    //         double catchedRes1 = intArray[3] / d;
    //         System.out.println("catchedRes1 = " + catchedRes1);
    //      } catch (ArithmeticException e) {
    //         System.out.println("Catching exception: " + e);
    //      }
         
    // }
    
    // Задание 3
    // Переместил catch (Throwable ex) вниз так как Класс Throwable является суперклассом всех ошибок 
    // и исключений в языке Java
    // так же FileNotFoundException не к чему ведь файл мы ни какой не открываем
    // то есть соответсвенно пути здесь и быть не может
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[8] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     }
     public static void printSum(Integer a, Integer b) //throws FileNotFoundException 
     {
        System.out.println(a + b);
     }
    // public static void main(String[] args) {
        
    // }
     
}
