import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int pictures = Integer.parseInt(scanner.nextLine());
        int surprise = Integer.parseInt(scanner.nextLine());

        double totalPrice = loveLetters * 0.60 + roses * 7.20 + keychains * 3.60 + pictures * 18.20 + surprise * 22;
        double totalProducts = loveLetters + roses + keychains + pictures + surprise;

        if (totalProducts >= 25) {
            totalPrice =totalPrice - totalPrice * 0.35;
        }

        double hostingTax = totalPrice * 0.10;

        double profit = totalPrice - hostingTax;

        if (profit >= partyPrice) {
            System.out.printf("Yes! %.2f lv left.", profit - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - profit);
        }
    }
}
