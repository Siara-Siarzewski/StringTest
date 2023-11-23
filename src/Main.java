import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(nextLine());

        String tekst1 = scanner;

        String tekst2 = "";
         int polowa = tekst1.length() / 2;
        tekst2 = tekst1.substring(polowa - 1, polowa + 1);
        String tekstOstateczny = "";
        String tekst3 = "";
        tekst3 = tekst1.substring(0, polowa-1);
        tekst1 = tekst3.concat(tekst1.substring(polowa + 1));
        tekstOstateczny = tekst2.concat(tekst1);
        System.out.println(tekstOstateczny);

    }
}