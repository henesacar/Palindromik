import java.util.Scanner;

public class Main {
    static boolean isPoli(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kontrol edilecek kelimeyi girin:");
        String word = scn.nextLine();
        if (isPoli(word)) {
            System.out.println(word + " kelimesi polindromdur.");
        } else {
            System.out.println(word + " kelimesi polindrom değildir.");
        }

    }

}
