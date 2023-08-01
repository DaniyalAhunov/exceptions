import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dz_3_itog {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: Фамилия Имя Отчество ДатаРождения(dd.mm.yyyy) НомерТелефона(Без +) Пол(f или m)");
            String input = scanner.nextLine().trim();

            String[] data = input.split(" ");
            if (data.length != 6) {
                System.err.println("Ошибка: введено недостаточно данных!");
                return;
            }

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            String phoneNumber = data[4];
            String gender = data[5];

            try {
                validateData(birthDate, phoneNumber, gender);

                String fileName = lastName + ".txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                    String userDataLine = lastName + " " + firstName + " " + middleName + " " +
                            birthDate + " " + phoneNumber + " " + gender;
                    writer.write(userDataLine);
                    writer.newLine();
                    System.out.println("Данные успешно записаны в файл: " + fileName);
                } catch (IOException e) {
                    System.err.println("Ошибка записи в файл: " + e.getMessage());
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private static void validateData(String birthDate, String phoneNumber, String gender) {
        // Проверка формата даты рождения (dd.mm.yyyy)
        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Неверный формат даты рождения!");
        }

        // Проверка номера телефона (целое беззнаковое число)
        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона!");
        }

        // Проверка пола (должен быть 'f' или 'm')
        if (!gender.matches("[fm]")) {
            throw new IllegalArgumentException("Неверный формат пола!");
        }
    }
}
