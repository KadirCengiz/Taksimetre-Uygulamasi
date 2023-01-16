import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri tanımla.

        int km;
        double perkm=2.20, total, startPrice=10;

        //Kilometreyi gir.

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi Kilometre Cinsiden Giriniz: ");
        km=input.nextInt();

        //Kilometreyi hesapla.

        total=km*perkm;
        total+=startPrice;

        //Tutarı karşılaştır ve yaz.
        
        total= (total<20)?20:total;
        System.out.println("Toplam Tutar: " +total);
    }
}