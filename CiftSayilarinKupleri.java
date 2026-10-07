public class CiftSayilarinKupleri {
    public static void main(String[] args) {
        long toplam = 0;

        for (int i = 2; i <= 20; i += 2) {
            toplam += (long) i * i * i;
        }

        System.out.println("1'den 20'ye kadar olan cift sayilarin kuplerinin toplami: " + toplam);
    }
}
