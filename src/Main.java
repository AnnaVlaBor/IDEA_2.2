public class Main {

    public static void main(String[] args) {

        int inCount = 999;  //сумма пополнения
        int count = 100;  //сумма на счету

        int persent;
        if (inCount >= 1000)
            persent = 1;
        else {
            persent = 0;
        }
        int amount = count + inCount;
        int bonus = inCount / 100 * persent;
        int total = amount + bonus;

        System.out.println("Ваш бонус: " + bonus);
        System.out.println("Итого на счету: " + total);



        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

