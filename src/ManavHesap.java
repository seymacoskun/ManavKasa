import java.util.Scanner;
public class ManavHesap 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println(""
				+ "MEYVE - SEBZE FIYAT LISTESI (TL): \n"
				+ "1) ARMUT: 2.14 \n"
				+ "2) ELMA: 3.67 \n"
				+ "3) DOMATES: 1.11 \n"
				+ "4) MUZ: 0.95 \n"
				+ "5) PATLICAN: 5.00 \n ");
		System.out.println("Kaç kilo armut aldýnýz ? : ");
		double armut = input.nextDouble();
		System.out.println("Kaç kilo elma aldýnýz ? : ");
        double elma=input.nextDouble();
        System.out.println("Kaç kilo domates aldýnýz ? : ");
        double domates=input.nextDouble();
        System.out.println("Kaç kilo muz aldýnýz ? : ");
        double muz=input.nextDouble();
        System.out.println("Kaç kilo patlýcan aldýnýz ? : ");
        double patlican=input.nextDouble();
        
        double toplamUcret = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) +(patlican*5.00);
        System.out.println("Toplam Tutar: " +toplamUcret);
	}
}