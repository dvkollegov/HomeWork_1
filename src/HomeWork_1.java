import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Arrays;


public class HomeWork_1 {

        public static void main(String[] args) {
            //Базовый уровень
            //Задача №1
            //Дано (их менять нельзя)
            String hi = "                Hello ";
            String world = " WoRld!";
            char newLine = '\n';
            //Создать из трех переменных единую строку,
            //Привести к правильному виду (Ниже)
            //затроить (Можно вызвать тольку одну команду System.out.print())
            //
            //Результат вывода на экран:
            //Hello world!
            //Hello world!
            //Hello world!

            String helloWorldNewline = hi.trim() + world.toLowerCase() + newLine;
            System.out.print(helloWorldNewline.repeat(3));



            //Задача №2
            //Создать переменные с ростом, весом.
            //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
            //Пример результата вывода на экран:
            //21.0

            // рост в метрах
            double height = 1.86;
            // вес в килограммах
            double weight = 82.4;
            // расчет ИМТ
            double bmi = weight / (height * height);
            System.out.printf("%.1f",bmi);
            System.out.println("");



            //Задача №3
            //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
            //и снова создать строку, вывести на экран

            // массив создан из строк
            //String[] arrayOfLetters = {"a", "b", "c", "d", "e"};
            //System.out.println(Arrays.toString(arrayOfLetters));
            //String[] arrayOfLettersCopy = Arrays.copyOf(arrayOfLetters, arrayOfLetters.length);
            //arrayOfLettersCopy [3] = "h";
            //System.out.println(Arrays.toString(arrayOfLettersCopy));

            // массив создан из символов
            char[] arrayOfLettersChar = {'a', 'b', 'c', 'd', 'e'};
            System.out.println(Arrays.toString(arrayOfLettersChar));
            char[] arrayOfLettersCharCopy = Arrays.copyOf(arrayOfLettersChar, arrayOfLettersChar.length);
            arrayOfLettersCharCopy [3] = 'h';
            System.out.println(Arrays.toString(arrayOfLettersCharCopy));
            // просто вывел значение массива без приведение к стоке через .toString
            System.out.println(arrayOfLettersChar);
            System.out.println(arrayOfLettersCharCopy);
            // создал массив и присвоил значение из первого массива arrayOfLettersChar
            char[] arrayOfLettersChar2 = arrayOfLettersChar;
            arrayOfLettersChar2 [3] = 'h';
            System.out.println(arrayOfLettersChar2);


            //Продвинутый уровень
            //Задача №1
            //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

            String meaning = "234";
            String someText = "some_text";
            System.out.println(Integer.parseInt(meaning) + someText.length());

            //Задача №2
            //Посчитать (a+b)^2 = ?, при a=3, b=5

            int a = 3;
            int b = 5;
            System.out.printf("%.0f", Math.pow((a+b), 2));
            System.out.println("");

            //Задача №3
            //Создать два массив чисел:
            // 1,2,5,7,10
            // 2,3,2,17,15
            // Создать массив чисел, в котором будут: все числа из этих двух массивов,
            // и результат умножения чисел с одинаковым порядковым номером
            //
            //Ожидаемый результат:
            //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
            //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
            //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

            int[] a1 = {1, 2, 5, 7, 10};
            int[] b1 = {2, 3, 2, 17, 15};
            int[] ab = {a1[0], a1[1], a1[2], a1[3], a1[4], b1[0], b1[1], b1[2], b1[3], b1[4], (a1[0]*b1[0]), (a1[1]*b1[1]), (a1[2]*b1[2]), (a1[3]*b1[3]), (a1[4]*b1[4])};
            System.out.println(Arrays.toString(ab));



            //Задача №4
            //В слове "Hello world!" заменить все l на r, сделать все буквы заглавными, выбрать первые 8 символов

            String helloWorld = "Hello world!";
            System.out.println(helloWorld.replace('l', 'r').toUpperCase().substring(0, 8));



            //Экспертный уровень
            //Задача №1
            //Создать метод маскирования персональных данных, который:
            //Телефон (до/после маскирования): 79991113344 / 7999***3344
            //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
            //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
            //
            //Входящие параметры: String text
            //Возвращаемый результат: String
            //
            //Примеры возможного текста:
            //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
            //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
            //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

            //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
            //Регулярные выражения, класс StringBuilder


        }


}
