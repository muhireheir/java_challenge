
public class Challenge {
    public static void main(String args[]) {
        try {
            System.out.println(calculateReduction(9));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static double calculateReduction(int months) {
        if (months >= 5 && months <= 9) {
            int TotalPayable = 5760;
            double discount = (TotalPayable * ((9 - months) * 5)) / 100;
            double totalDiscount = TotalPayable - discount;
            return totalDiscount / months;
        } else {
            throw new IllegalArgumentException("Invalid number of months, should be between 5 and 9");
        }
    }
}