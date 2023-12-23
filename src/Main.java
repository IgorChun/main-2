public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int replenishmentAmount = 1100;
        int amount;
        int bonus = 100;
        int bonusRubles;
        int totalAmount;

        amount = replenishmentAmount + initialAccount;
        bonusRubles = replenishmentAmount / bonus;

        if (replenishmentAmount > 1000) {
            totalAmount = amount + bonusRubles;
        } else {
            totalAmount = amount;
            bonusRubles = 0;
        }
        System.out.println("Итоговая сумма на счету - " + totalAmount);
        System.out.println("Количество бонусных рублей - " + bonusRubles);

    }
}
