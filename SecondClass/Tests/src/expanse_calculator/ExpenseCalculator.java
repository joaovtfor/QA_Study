import java.util.ArrayList;
import java.util.List;

public class ExpenseCalculator {
    private List<Expense> expenses;

    public ExpenseCalculator() {
        this.expenses = new ArrayList<>();
    }

    public boolean addExpense(double amount, String category) {
        if (amount < 0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            return false;
        }
        if (category == null || category.trim().isEmpty()) {
            return false;
        }

        expenses.add(new Expense(amount, category.trim()));
        return true;
    }

    public double getCategoryTotal(String category) {
        if (category == null || category.trim().isEmpty()) {
            return 0.0;
        }

        String normalizedCategory = category.trim().toLowerCase();
        return expenses.stream()
                .filter(expense -> expense.getCategory().toLowerCase().equals(normalizedCategory))
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    private static class Expense {
        private final double amount;
        private final String category;

        public Expense(double amount, String category) {
            this.amount = amount;
            this.category = category;
        }

        public double getAmount() {
            return amount;
        }

        public String getCategory() {
            return category;
        }
    }
}