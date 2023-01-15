public class Main {
    public static void main(String[] args) {

        int invoice = 100;
        int amountPayment = 1000;

        if (amountPayment > 1000) {
            System.out.println("Бонусы начислены");
        } else {
            System.out.println("Бонусы не начислены");
        }

        int amountBonus = (amountPayment / 100);
        if (amountPayment <= 1000) {
            amountBonus = 0;
        }

        int finalInvoice = (invoice + amountPayment + amountBonus);

        System.out.println("Количество бонусов: " + amountBonus + " руб.");
        System.out.println("Итоговый счет: " + finalInvoice + " руб.");

    }
}
