public class Task1 {
    public static void main(String[] args) {
        double priseA = 1000.00;
        double priseB = 500.00;
        double summa = priseA+priseB;
        double skidka = summa * 0.10;
        double zena = summa-skidka;

        System.out.println("Skidka: " +skidka);
        System.out.println("Zena: " +zena);

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int summa = (a+b+c+d)/4;
        System.out.println("Summa: "+summa);

        int ostat = (a+b+c+d)%4;
        System.out.println("Ostatok: "+ostat);


    }

}
