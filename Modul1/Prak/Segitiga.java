package Prak;

import java.util.Scanner;

// T - Type
public class Segitiga<T extends Number> {
    // generic methods
    private T alas;
    private T tinggi;
    static Scanner input = new Scanner(System.in);

    public Segitiga(T alas, T tinggi) {
        // constructor
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        double alasSegitiga = alas.doubleValue();
        double tinggiSegitiga = tinggi.doubleValue();
        double luas = 0.5 * alasSegitiga * tinggiSegitiga;
        return (int) luas;
    }

    public double getResultAsDouble() {
        double alasSegitiga = alas.doubleValue();
        double tinggiSegitiga = tinggi.doubleValue();
        double luas = 0.5 * alasSegitiga * tinggiSegitiga;
        return luas;
    }

    public static void menu() {
        try {
            System.out.println("\n~~~~~ MENGHITUNG LUAS SEGITIGA ~~~~~");
            System.out.println("\nMau menampilkan hasil luas dalam bentuk?");
            System.out.println("1. Hasil to Integer\n2. Hasil to Double\n3. Exit\n");
            System.out.print("Masukan Pilihan 1 / 2 / 3 : \n");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan nilai alas & tinggi secara berurutan: \n");
                    int intAlas = input.nextInt();
                    int intTinggi = input.nextInt();

                    Segitiga<Integer> luasInt = new Segitiga<>(intAlas, intTinggi);

                    System.out.println("Luas segitiga dalam integer: " + luasInt.getResultAsInt());
                    next();
                    break;

                case 2:
                    System.out.print("Masukan nilai alas & tinggi secara berurutan: \n");
                    double doubleAlas = input.nextDouble();
                    double doubleTinggi = input.nextDouble();

                    Segitiga<Double> luasDouble = new Segitiga<>(doubleAlas, doubleTinggi); // geeric methods

                    System.out.println("Luas segitiga dalam double: " + luasDouble.getResultAsDouble());
                    next();
                    break;

                case 3:
                    System.out.println("Yaudah, makasi ya~\n");
                    System.exit(0);

                default:
                    System.out.println("PILIHAN ANDA TIDAK ADA DALAM MENU!");
                    menu();
            }
        } catch (Exception e) {
            System.out.println("\nINPUTAN SALAH!");
            menu();
        }
    }

    public static void next() {
        System.out.print("\nBack to menu? (y/n) ? ");
        String pilihan = input.next();

        if (pilihan.equals("y")) {
            menu();
        } else if (pilihan.equals("n")) {
            input.close();
            System.out.println("Yaudah, makasi ya~\n");
            System.exit(0);
        } else {
            System.out.println("INPUTAN SALAH!");
            next();
        }
    }

    public static void main(String[] args) {
        menu();
    }
}