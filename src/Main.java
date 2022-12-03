public class Main {
    public static void main(String[] args) {
        /* Задача 1.
         * Объявите три массива:
         * 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
         * 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
         * 3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами. */

        System.out.println("Задача 1");

        int[] array = new int[3];
        array[0] = -1;
        array[1] = 2;
        array[2] = 3;

        double[] array1 = {-1.57, 7.654, 9.986};

        int[] array2 = new int[5];
        int index = 0;
        for (int valueArray2 = 5; index < array2.length; valueArray2 += 5) { //Заполнение массива при помощи цикла
            array2[index] = valueArray2;
            index++;
        }
        printArray(array); //Вывод в консоль для проверки любого массива. Функции находятся ниже.

        /*Задача 2.
         * Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
         * Запятая между последним элементом одного массива и первым элементом следующего не нужна. */

        System.out.println("\n\nЗадача 2.");

        printArrayTask2(array);
        printArrayTask2(array1);
        printArrayTask2(array2);


        /* Задача 3.
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
        Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.*/

        System.out.println("\n\nЗадача 3");

        printArrayBackwards(array);
        printArrayBackwards(array1);
        printArrayBackwards(array2);

        /* Задача 4.
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        Распечатайте результат преобразования в консоль.*/

        System.out.println("\n\nЗадача 4.");
        printArray(array); // Результат до выполнения задачи
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        System.out.println();
        printArray(array); // Результат после выполнения задачи


    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + ", ");
        }
    }

    public static void printArrayTask2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArrayTask2(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArrayBackwards(int[] array) {
        for (int i = (array.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArrayBackwards(double[] array) {
        for (int i = (array.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }


}





