public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int replenishmentAmount = 1100;
        int amount;
        int bonus = 100;

        amount = replenishmentAmount + initialAccount;

        if (replenishmentAmount > 1000) {
            amount = amount + replenishmentAmount / bonus;


        }
        System.out.println("Итоговая сумма на счету - " + amount);

    }
    }
