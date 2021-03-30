package homework1;

public class HomeWork1 {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public class homework {
        public static void main(String[] args) {
        }
    }

    //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void z2 (String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        double e = 1.37;
        float f = 1.565f;
        boolean g = true;
        char h = 'A';
        String str = "Строка";
    }

    //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    static float z3 (float a, float b, float c, float d) {
        return a * (b + (c / d);
    }

    //    4. Написать метод, принимающий на вход два целых числа и проверяющий,
//       что их сумма лежит в пределах от 10 до 20 (включительно),
//       если да – вернуть true, в противном случае – false
    static boolean z4 (int a, int b){
        if ((a+b)>= 10 && (a+b)<=20) {
            return true;
        } else {
            return false;}
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
//   метод должен напечатать в консоль,положительное ли число передали или отрицательное.
//   Замечание: ноль считаем положительным числом.
    static void z5 (int a){
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
    static boolean z6 (int a){
        if (a<0){
            return true;
        } else {return false;
        }}


//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//   Метод должен вывести в консоль сообщение «Привет, указанное_имя!»

    static void z7 (String str) {
        System.out.println("Привет," + str);
    }
}
