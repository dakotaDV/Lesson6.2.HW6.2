public class Main {



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        // task1
        // Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.Нужно написать программу,
        // которая решит эту задачу, и вывести в консоль результат
        // в формате: «Сумма трат за месяц составила … рублей».

        int[] arr = generateRandomArray();
        int arrMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            arrMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrMonth + " рублей.");

        // task2
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        // в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

       var wastes= generateRandomArray();
        int min = wastes[0];
        for (int i = 0; i < wastes.length; i++) {
            if (min > wastes[i]) {
                min = wastes[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");

        int max= wastes[0];
        for (int i = 0; i < wastes.length; i++) {
            if (max < wastes[i]) {
                max = wastes[i];
            }
        }
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей." );

        // task3
        // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        // Нужно написать программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        // **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).

       wastes = generateRandomArray();
       int sum = 0;
        for (var waste : wastes) {
          sum += waste;
        }
        var result = (double) sum / wastes.length;
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей.");

        //task4
        // В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О.
        // сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        // Данные с именами сотрудников хранятся в виде массива символов (char[]).
        // Напишите код, который в случае такого бага будет выводить Ф. И. О.
        // сотрудников в корректном виде. В качестве данных для массива используйте:
        // char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // В результате в консоль должно быть выведено "Ivanov Ivan".

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
    }



