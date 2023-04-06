package Modul2.Prak;

import java.util.ArrayList;

public class Kegiatan1 {
    public static void main(String[] args) {
        /* Membuat objek ArrayList dengan tipe String dan menamainya hewan. */
        ArrayList<String> hewan = new ArrayList<>();

        /*
         * Mengisi ArrayList dengan elemen-elemen yang diberikan
         * yaitu nama-nama hewan sesuai index modul.
         */
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        /* Menambahkan elemen "Badak" dan "Bebek". */
        hewan.add("Badak");
        hewan.add("Bebek");

        System.out.println(hewan);

        /*
         * program akan menghitung jumlah elemen "Bebek"
         * dan menampilkan posisi index-nya.
         */
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                System.out.println("Posisi index Bebek: " + i);
                /* Array dimulai dari 0 */
            }
        }
        System.out.println("Jumlah elemen Bebek: " + jumlahBebek);

        /* program akan menghapus posisi "Bebek" yang pertama. */
        hewan.remove("Bebek");

        System.out.println(hewan);

        /*
         * Menampilkan elemen pada index ke-0 dan ke-2,
         * lalu menghapus index ke-0.
         */
        System.out.println("Elemen pada index ke-0: " + hewan.get(0));
        System.out.println("Elemen pada index ke-2: " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);

        /*
         * Mengubah index ke-0 dari "Cicak" menjadi "Ular",
         * menambahkan elemen baru pada index ke-2 dengan "Itik".
         */
        hewan.set(0, "Ular");
        System.out.println(hewan);
        hewan.add(2, "Itik");
        System.out.println(hewan);

        /* Menghapus elemen di antara index ke-1 dan ke-5. */
        hewan.subList(1, 5).clear();

        /* Menampilkan elemen pertama dan terakhir pada ArrayList. */
        System.out.println(hewan);
        System.out.println("Elemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1));

        /* Menampilkan jumlah elemen pada ArrayList. */
        System.out.println("Jumlah elemen: " + hewan.size());

        /* Mencari posisi index dari "Badak". */
        int indexBadak = hewan.indexOf("Badak");
        System.out.println("Posisi index Badak: " + indexBadak);
    }
}