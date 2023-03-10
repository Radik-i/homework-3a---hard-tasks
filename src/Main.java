public class Main {
    public static void main(String[] args) {
        task6();
        task7();
        task8();
    }

    public static void task6() {
        /*Объявите целочисленные переменные *a* = 12, *b* = 27, *c* = 44, *d* = 15, *e* = 9.
Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной *result*.
Инвертируйте результат (значение в переменной *result*), преобразовав его в вариант с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
Выведите (напечатайте) результат в консоль.*/
        System.out.println("Задача 6");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println("Результат составил "+ result);
        System.out.println();
    }

    public static void task7() {
        /*Объявите целочисленные переменные *a* = 5 и *b* = 7.
С помощью математических манипуляций добейтесь того, чтобы *a* = 7 и *b* = 5.
Использовать дополнительные переменные или числа запрещено.*/
        System.out.println("Задача 7");
        int a = 5;
        int b = 7;
        System.out.println("Сначала a = "+ a +"   b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Потом   a = "+ a +"   b = "+b);
        System.out.println();
    }

    public static void task8() {
        /*Объявите переменную *a* и инициализируйте ее любым трехзначным числом.
Объявите переменную *b* и, путем математических операций над *a* получите и присвойте переменной *b* цифру, которая находится в центре значения из переменной *a*.
Например, если *a* = 2**5**6, то необходимо с помощью математических действий достать цифру 5 из центра и присвоить переменной *b*. Если *a* = 7**8**9, то b должна быть инициализирована числом 8, так как эта цифра является вторым из трех (центральным) символом в значении *a*.
Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых трехзначных числах из *a* без изменений.
Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить к *a* для корректного значения в *b* нельзя, так как при каждом изменении значения в *a* её нужно пересчитывать.*/

        System.out.println("Задача 8");
        int a = 201;
        int b = a / 10 % 10;
        System.out.println("b = " + b );
        System.out.println();
    }

}